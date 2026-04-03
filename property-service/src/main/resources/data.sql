INSERT INTO parcels (fid, folio, geom, lot_size)
SELECT fid, folio, geom, lot_size
FROM parcels_old;