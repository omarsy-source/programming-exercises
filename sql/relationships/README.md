# SQL relationship exercises

[Collection](../../README.md) / [SQL index](../README.md)

This folder contains 6 independent exercise scripts.

| Script | Focus |
| --- | --- |
| [research_groups.sql](research_groups.sql) | Links research groups and lecturers using a foreign key. |
| [people_and_expenses.sql](people_and_expenses.sql) | Stores people and their expenses in separate tables. |
| [lecture_schedules.sql](lecture_schedules.sql) | Links lectures and scheduled sessions using a composite key. |
| [levels_and_obstacles.sql](levels_and_obstacles.sql) | Links levels and obstacles; deleting a level also deletes its obstacles. |
| [hardware_specialization.sql](hardware_specialization.sql) | Models the properties of different hardware types in separate tables. |
| [university_roles.sql](university_roles.sql) | Stores different university roles in one shared table. |

## Level and obstacle relationship

[levels_and_obstacles.sql](levels_and_obstacles.sql) creates the `Komposition` database and two tables:

| Table | Key and relationship |
| --- | --- |
| `Level` | `level_id` is the primary key. |
| `Hindernisse` | The primary key is the pair `(hindernis_id, level_id)`; its non-null `level_id` references `Level.level_id`. |

An obstacle ID can be reused in a different level, but the same obstacle/level pair cannot appear twice. The foreign key uses `ON DELETE CASCADE`: deleting a level also deletes its associated obstacles; deleting an obstacle does not delete the level.

The script defines the schema only. It contains no sample inserts, deletes, or result queries, so running it does not demonstrate the cascade with sample rows.

## Research group association

[research_groups.sql](research_groups.sql) creates `Forschungsgruppen` and `Dozenten` in the `Aggregation` database. Each lecturer has one nullable `forschungsgruppen_id` foreign-key column:

- A lecturer can have no group by leaving that column `NULL`.
- A non-null group ID must reference an existing research group.
- Multiple lecturers can reference the same group because the foreign-key column is not unique.

The script declares no cascading delete action. It defines tables only, with no sample rows or result queries. The required group-topic column is spelled `theama` in the source; use that exact spelling in follow-up queries.

## Before running

Follow the [SQL running instructions](../README.md#running-a-script) and review the [existing limitations](../README.md#existing-limitations). Scripts may reuse or recreate named databases, so use an isolated exercise environment and run one script at a time.

Database and schema identifiers retain their original spelling. These files are standalone exercises rather than a migration sequence. SQL execution was not included in the [import validation](../../docs/VALIDATION.md).
