# SQL exercises

Fifteen independent MySQL-style scripts covering schema design, relationships, demo data, joins, and grouped queries. Filenames and folders use English; simple German comments explain the SQL steps.

Database, table, column, and literal values retain their original spelling, so existing relationships and query behavior are preserved.

| Script | Focus |
| --- | --- |
| [research_groups.sql](relationships/research_groups.sql) | Forschungsgruppen und Dozenten über einen Fremdschlüssel verbinden. |
| [people_and_expenses.sql](relationships/people_and_expenses.sql) | Personen und ihre Ausgaben in getrennten Tabellen speichern. |
| [lecture_schedules.sql](relationships/lecture_schedules.sql) | Vorlesungen und Termine mit einem zusammengesetzten Schlüssel verknüpfen. |
| [levels_and_obstacles.sql](relationships/levels_and_obstacles.sql) | Level und Hindernisse verbinden; beim Löschen eines Levels werden seine Hindernisse mitgelöscht. |
| [hardware_specialization.sql](relationships/hardware_specialization.sql) | Die Eigenschaften verschiedener Hardwaretypen in eigenen Tabellen darstellen. |
| [university_roles.sql](relationships/university_roles.sql) | Verschiedene Hochschulrollen in einer gemeinsamen Tabelle speichern. |
| [image_missions.sql](schemas/image_missions.sql) | Benutzer, Missionen, Bilder, Betrachtungen und Bewertungen miteinander verknüpfen. |
| [fitness_studio.sql](schemas/fitness_studio.sql) | Mitglieder, Trainingspläne und Übungen über ihre Schlüssel verbinden. |
| [app_store_hub.sql](schemas/app_store_hub.sql) | Benutzer, Entwickler, Apps, Downloads, Bewertungen und Abonnements modellieren. |
| [blog.sql](schemas/blog.sql) | Autoren und Beiträge anlegen und Beispieldaten einfügen. |
| [clinic.sql](schemas/clinic.sql) | Patienten, Ärzte und Termine anlegen und anschließend Tabellen mit ALTER TABLE ändern. |
| [role_playing_game.sql](schemas/role_playing_game.sql) | Gilden, Spieler und Missionen mit ihren Zuordnungen speichern und abfragen. |
| [training_school.sql](schemas/training_school.sql) | Kurse und Einschreibungen verbinden und die Teilnehmer pro Kurs zählen. |
| [lecture_enrollments.sql](schemas/lecture_enrollments.sql) | Studierende über eine Zuordnungstabelle mit Vorlesungen verbinden. |
| [vulnerability_inventory.sql](schemas/vulnerability_inventory.sql) | Zielsysteme und Schwachstellen zuordnen und die Treffer pro Betriebssystem zählen. |

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
