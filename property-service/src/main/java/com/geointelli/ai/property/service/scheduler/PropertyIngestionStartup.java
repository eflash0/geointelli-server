package com.geointelli.ai.property.service.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.geointelli.ai.property.service.manager.PropertyIngestionManager;
import com.geointelli.ai.property.service.service.ParcelService;

@Component
@RequiredArgsConstructor
@Slf4j
public class PropertyIngestionStartup implements CommandLineRunner {

    private final PropertyIngestionManager manager;
    private final ParcelService parcelService;

    @Override
    public void run(String... args) {
        log.info("Startup ingestion triggered");
        // manager.ingestAllFolios(parcelService.getAllFolios());
    }
}