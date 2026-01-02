-- Create or replace the 'recon' schema
-- and set it as the default search path for the 'stagingrepdb' database
DROP SCHEMA IF EXISTS recon CASCADE;
CREATE SCHEMA recon;
CREATE TABLE recon.source_customer (id INTEGER, email TEXT);
CREATE TABLE recon.target_persons (id INTEGER, email TEXT);
ALTER DATABASE stagingrepdb SET search_path = recon, public;
