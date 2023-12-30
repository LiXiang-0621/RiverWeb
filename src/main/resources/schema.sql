CREATE TABLE IF NOT EXISTS "location_data"  (
                               id INTEGER PRIMARY KEY,
                               latitude DOUBLE,
                               longitude DOUBLE,
                               number INTEGER,
                               markerLabel NVARCHAR(255),
                               type VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS "API_KEY" (
                         name VARCHAR(255),
                         api_key VARCHAR(255)
);