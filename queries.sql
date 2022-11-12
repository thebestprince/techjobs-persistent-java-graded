-- Part 1: Test it with SQL
id INTEGER PRIMARY KEY AUTO_INCREMENT,
    employer VARCHAR(75),
    name VARCHAR(75),
    skills VARCHAR(75);

-- Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";

-- Part 3: Test it with SQL
DROP TABLE job;
-- Part 4: Test it with SQLE
SELECT *
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;