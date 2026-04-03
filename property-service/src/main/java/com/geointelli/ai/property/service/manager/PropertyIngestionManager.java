package com.geointelli.ai.property.service.manager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.geointelli.ai.property.service.service.PropertyIngestionService;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class PropertyIngestionManager {

    private final PropertyIngestionService propertyIngestionService;

    private final ExecutorService executor = Executors.newFixedThreadPool(10);
    private final AtomicBoolean running = new AtomicBoolean(false);

    public void ingestAllFolios(List<String> folios) {

        if (!running.compareAndSet(false, true)) {
            log.warn("Ingestion already running. Skipping...");
            return;
        }

        log.info("Starting ingestion for {} folios", folios.size());

        try {
            int batchSize = 100;

            for (int i = 0; i < folios.size(); i += batchSize) {
                List<String> batch = folios.subList(i, Math.min(i + batchSize, folios.size()));

                List<Future<?>> futures = batch.stream()
                        .map(folio -> executor.submit(() -> {
                                propertyIngestionService.ingest(folio);
                        }))
                        .collect(Collectors.toList());
                // wait batch completion
                for (Future<?> future : futures) {
                    try {
                        future.get();
                    } catch (Exception e) {
                        log.error("Batch execution error", e);
                    }
                }
            }

            log.info("Ingestion completed successfully");

        } finally {
            running.set(false);
        }
    }
}