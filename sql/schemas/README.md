# SQL schemas and queries

[Collection](../../README.md) / [SQL index](../README.md)

This folder contains 9 independent exercise scripts.

| Script | Focus |
| --- | --- |
| [image_missions.sql](image_missions.sql) | Links users, missions, images, views, and ratings. |
| [fitness_studio.sql](fitness_studio.sql) | Links members, training plans, and exercises through their keys. |
| [app_store_hub.sql](app_store_hub.sql) | Models users, developers, apps, downloads, ratings, and subscriptions. |
| [blog.sql](blog.sql) | Creates authors and posts and inserts sample data. |
| [clinic.sql](clinic.sql) | Creates patients, doctors, and appointments, then modifies tables with ALTER TABLE. |
| [role_playing_game.sql](role_playing_game.sql) | Stores and queries guilds, players, missions, and their associations. |
| [training_school.sql](training_school.sql) | Links courses and enrollments and counts participants per course. |
| [lecture_enrollments.sql](lecture_enrollments.sql) | Links students and lectures through a junction table. |
| [vulnerability_inventory.sql](vulnerability_inventory.sql) | Associates target systems and vulnerabilities and counts matches per operating system. |

## Clinic schema after alterations

[clinic.sql](clinic.sql) first recreates `clinic_db`, creates three tables, and inserts 4 patients, 3 doctors, and 4 appointments. Its final `ALTER TABLE` statements change the schema as follows:

| Table | Final change |
| --- | --- |
| `patients` | Adds nullable `phone VARCHAR(100)` and renames `city` to `patient_city`. |
| `doctors` | Adds nullable `email VARCHAR(100)`. |
| `appointments` | Expands `status` from `VARCHAR(30)` to `VARCHAR(150)`. |

The inserted rows have no phone or email values, so those new columns remain `NULL`. Any follow-up query for a patient's city must use `patient_city`. The script contains no `SELECT` statement to display its sample rows.

## Before running

Follow the [SQL running instructions](../README.md#running-a-script) and review the [existing limitations](../README.md#existing-limitations). Scripts may reuse or recreate named databases, so use an isolated exercise environment and run one script at a time.

Database and schema identifiers retain their original spelling. These files are standalone exercises rather than a migration sequence. SQL execution was not included in the [import validation](../../docs/VALIDATION.md).
