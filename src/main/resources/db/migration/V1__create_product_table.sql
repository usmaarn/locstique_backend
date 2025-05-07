CREATE TABLE IF NOT EXISTS products (
     id TEXT PRIMARY KEY,
     name VARCHAR(255) NOT NULL,
     description TEXT,
     price DOUBLE PRECISION NOT NULL,
     image VARCHAR(255),
     discount DOUBLE PRECISION,
     details TEXT,
     stock INTEGER NOT NULL,
     tag VARCHAR(100),
     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     CONSTRAINT uq_product_name UNIQUE (name)
);
