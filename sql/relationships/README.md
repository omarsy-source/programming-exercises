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

## Before running

Follow the [SQL running instructions](../README.md#running-a-script) and review the [existing limitations](../README.md#existing-limitations). Scripts may reuse or recreate named databases, so use an isolated exercise environment and run one script at a time.

Database and schema identifiers retain their original spelling. These files are standalone exercises rather than a migration sequence. SQL execution was not included in the [import validation](../../docs/VALIDATION.md).
