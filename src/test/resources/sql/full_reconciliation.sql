/******************************************************************************************
 Reconciliation: CUSTOMER (source extract) vs PERSONS (target extract)
 -- SINGLE VIEW RECONCILIATION --
 -- USEFUL FOR REPORTING --
 -- CENTRAL VIEW FOR ANy MISMATCHES --
******************************************************************************************/

WITH
    src AS (
        SELECT id, email FROM stagingrepdb.recon.source_customer
    ),
    tgt AS (
        SELECT id, email FROM stagingrepdb.recon.target_persons
    ),

    counts AS (
        SELECT
            (SELECT COUNT(*) FROM src) AS source_count,
            (SELECT COUNT(*) FROM tgt) AS target_count
    ),

    missing_in_target AS (
        SELECT s.id, s.email
        FROM src s
                 LEFT JOIN tgt t ON s.id = t.id
        WHERE t.id IS NULL
    ),

    extra_in_target AS (
        SELECT t.id, t.email
        FROM tgt t
                 LEFT JOIN src s ON t.id = s.id
        WHERE s.id IS NULL
    ),

    email_mismatches AS (
        SELECT s.id, s.email AS source_email, t.email AS target_email
        FROM src s
                 JOIN tgt t ON s.id = t.id
        WHERE s.email IS DISTINCT FROM t.email
    )

SELECT
    'Record Count Check' AS check_type,
    (SELECT source_count FROM counts) AS source_count,
    (SELECT target_count FROM counts) AS target_count,
    CASE
        WHEN (SELECT source_count FROM counts) = (SELECT target_count FROM counts)
            THEN 'PASS' ELSE 'FAIL' END AS status
UNION ALL
SELECT
    'Missing in Target', (SELECT COUNT(*) FROM missing_in_target), 0,
    CASE WHEN (SELECT COUNT(*) FROM missing_in_target) = 0 THEN 'PASS' ELSE 'FAILED' END
UNION ALL
SELECT
    'Extra in Target', (SELECT COUNT(*) FROM extra_in_target), 0,
    CASE WHEN (SELECT COUNT(*) FROM extra_in_target) = 0 THEN 'PASS' ELSE 'FAILED' END
UNION ALL
SELECT
    'Email Mismatches', (SELECT COUNT(*) FROM email_mismatches), 0,
    CASE WHEN (SELECT COUNT(*) FROM email_mismatches) = 0 THEN 'PASS' ELSE 'FAILED' END
ORDER BY check_type;