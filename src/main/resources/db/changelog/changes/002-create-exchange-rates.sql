-- liquibase formatted sql

-- changeset DorzhievHV:002-create-exchange-rates
CREATE TABLE exchange_rates (
                                id BIGSERIAL PRIMARY KEY,
                                base_currency_id BIGINT NOT NULL,
                                target_currency_id BIGINT NOT NULL,
                                rate DECIMAL(20,6) NOT NULL,
                                CONSTRAINT fk_exchange_rates_base_currency
                                    FOREIGN KEY (base_currency_id) REFERENCES currencies(id),
                                CONSTRAINT fk_exchange_rates_target_currency
                                    FOREIGN KEY (target_currency_id) REFERENCES currencies(id),
                                CONSTRAINT uk_exchange_rates_pair
                                    UNIQUE (base_currency_id, target_currency_id)
);