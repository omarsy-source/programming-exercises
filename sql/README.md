# SQL exercises

[Back to the collection](../README.md)

Fifteen independent MySQL-style scripts covering schema design, relationships, demo data, joins, and grouped queries. Filenames and folders use English; simple German comments explain the SQL steps.

Database, table, column, and literal values retain their original spelling, so existing relationships and query behavior are preserved.

| Script | Focus |
| --- | --- |
| [research_groups.sql](relationships/research_groups.sql) | Links research groups and lecturers using a foreign key. |
| [people_and_expenses.sql](relationships/people_and_expenses.sql) | Stores people and their expenses in separate tables. |
| [lecture_schedules.sql](relationships/lecture_schedules.sql) | Links lectures and scheduled sessions using a composite key. |
| [levels_and_obstacles.sql](relationships/levels_and_obstacles.sql) | Links levels and obstacles; deleting a level also deletes its obstacles. |
| [hardware_specialization.sql](relationships/hardware_specialization.sql) | Models the properties of different hardware types in separate tables. |
| [university_roles.sql](relationships/university_roles.sql) | Stores different university roles in one shared table. |
| [image_missions.sql](schemas/image_missions.sql) | Links users, missions, images, views, and ratings. |
| [fitness_studio.sql](schemas/fitness_studio.sql) | Links members, training plans, and exercises through their keys. |
| [app_store_hub.sql](schemas/app_store_hub.sql) | Models users, developers, apps, downloads, ratings, and subscriptions. |
| [blog.sql](schemas/blog.sql) | Creates authors and posts and inserts sample data. |
| [clinic.sql](schemas/clinic.sql) | Creates patients, doctors, and appointments, then modifies tables with ALTER TABLE. |
| [role_playing_game.sql](schemas/role_playing_game.sql) | Stores and queries guilds, players, missions, and their associations. |
| [training_school.sql](schemas/training_school.sql) | Links courses and enrollments and counts participants per course. |
| [lecture_enrollments.sql](schemas/lecture_enrollments.sql) | Links students and lectures through a junction table. |
| [vulnerability_inventory.sql](schemas/vulnerability_inventory.sql) | Associates target systems and vulnerabilities and counts matches per operating system. |

## Running a script

Use an isolated MySQL exercise database environment. Several scripts contain `DROP DATABASE` and recreate their named example database. Scripts that reuse the same database name are alternatives, not a migration sequence.

With the MySQL client installed, start in the repository root and enter the `sql` directory before running a script. The relative path below is resolved from that directory:

```bash
cd sql
mysql -u YOUR_USER -p < schemas/clinic.sql
```

`fitness_studio.sql` starts with `USE Fitnessstudio`, so that database must already exist. Other scripts may create their own database. MySQL-specific types and commands mean these files are not portable directly to SQLite.

## Existing limitations

- `image_missions.sql` references `mission(misson_name)`, but the declared key is `mission(name)`.
- The final query in `role_playing_game.sql` references `Spieler.Spieler_ID`, while that table declares `ID`.
- Those original inconsistencies are documented and preserved.

Validation compared SQL executable tokens before and after the comments and file moves. No MySQL server was available, so the scripts were not executed against a database. No database was modified during this import.
