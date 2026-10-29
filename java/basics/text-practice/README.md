# Text Practice

A standalone text and console practice program.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [JSAK.java](src/text/JSAK.java) | `text.JSAK` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out text.JSAK
```

The supplied `NotenListe.txt` is kept alongside this README for the file-reading example.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/text`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
