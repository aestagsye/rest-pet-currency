-- liquibase formatted sql

-- changeset DorzhievHV:001-create-currencies
CREATE TABLE currencies (
                            id BIGSERIAL PRIMARY KEY,
                            code VARCHAR(3) NOT NULL UNIQUE,
                            full_name VARCHAR(255) NOT NULL,
                            sign VARCHAR(10) NOT NULL
);