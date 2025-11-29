-- Summary stats for PERSON table
SELECT
    COUNT(*) AS total_person_records,
    COUNT(DISTINCT id) AS distinct_person_ids
FROM targetdb.public.persons;