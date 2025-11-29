-- Summary stats for CUSTOMER table
SELECT
    COUNT(*) AS total_customer_records,
    COUNT(DISTINCT id) AS distinct_customer_ids
FROM stagingrepdb.public.customer;