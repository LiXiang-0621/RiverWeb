CREATE TABLE IF NOT EXISTS "COORDINATE"  (
                               id INTEGER PRIMARY KEY,
                               latitude DOUBLE,
                               longitude DOUBLE,
                               number INTEGER,
                               markerLabel NVARCHAR(255),
                               type VARCHAR(255)
);

CREATE TABLE  IF NOT EXISTS "TIDE"
(
    id INTEGER PRIMARY KEY,
    Date DATE, Time TIME,
    local_avg_sea_level INTEGER,
    max_scale_reference INTEGER,
    water_level VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS "API_KEY" (
                         name VARCHAR(255),
                         api_key VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS "USER_INFO"
(
    user_id character varying(30)  NOT NULL,
    user_name character varying(50) NOT NULL,
    role_id character varying(30) NOT NULL,
    email character varying(200) NOT NULL,
    enabled character varying(1) NOT NULL DEFAULT 1,
    password character varying(300) NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (user_id)
    );


CREATE TABLE IF NOT EXISTS "BOOKS"
(
    book_seq bigint NOT NULL,
    book_name character varying(50) NOT NULL,
    author character varying(50) NOT NULL,
    price bigint NOT NULL,
    CONSTRAINT book_pkey PRIMARY KEY (book_seq)
    );