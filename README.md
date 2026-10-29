# Programming Exercises

My collection of programming exercises from studying Applied Computer Science. The examples are organized by language and topic, with English Java/Python identifiers and simple German source explanations.

## Explore the collection

| Language | Contents | Start here |
| --- | --- | --- |
| Java | 30 independent source groups containing 266 Java files, covering fundamentals, arrays, methods, strings, OOP, collections, exceptions, algorithms, files, testing, and small games. | [Java index](java/README.md) |
| SQL | 15 MySQL-style scripts covering relationships, schemas, sample data, and queries. | [SQL index](sql/README.md) |
| Python | 7 independent standard-library console exercises. | [Python index](python/README.md) |

Each Java project includes its own README, source list, and entry-point table. Projects with similar class names are kept independent so they do not interfere with one another.

## Run an exercise

For Java, open a project folder and follow its README. A typical command is:

```bash
javac -encoding UTF-8 -d out @sources.txt
java -cp out PACKAGE_NAME.CLASS_NAME
```

`PACKAGE_NAME.CLASS_NAME` is a placeholder: replace it with an entry point from the selected project's README (for example, `gitHub.NumberSequence` in [Number Sequence](java/loops/number-sequence/README.md)). Run the compile command inside that project folder so `sources.txt` resolves correctly.

Python scripts run with `python filename.py`. SQL scripts target MySQL; follow the [SQL instructions](sql/README.md), including each script's existing database assumptions.

## Learning notes

This is a learning collection. It includes unfinished snippets and examples with existing limitations, which are documented rather than silently corrected. Source logic, calculations, demo values, and output literals were preserved during the naming and organization update. SQL database and schema identifiers keep their original spelling.

The Java archive contained 31 identical project copies. Those copies were consolidated, while genuinely different implementations remain separate. Required sample text files and configuration files are included; IDE caches and compiled output are excluded.

## Verification and provenance

- [Validation report](docs/VALIDATION.md): compilation scope, output comparisons, and remaining limitations.
- [Original-to-organized source map](docs/import-map.json): destination of every source file from the uploaded archive.
- [Profile README draft](docs/PROFILE_README.md): introduction prepared for my GitHub profile.
