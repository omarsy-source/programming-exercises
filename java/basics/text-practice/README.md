# Text Practice

[Collection](../../../README.md) / [Java index](../../README.md) / [basics](../README.md) · [Compiler source list](sources.txt)

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

## File input

When the program prints `Dateiname eingeben:`, enter `NotenListe.txt` to read the supplied sample. Relative filenames are resolved from the process working directory; when launching from an IDE, set that directory to this project folder.

The filename is read with `Scanner.next()`, so paths containing spaces are not supported by this input routine. The program counts nonempty lines, then reads a student number and a grade for each record. Lines containing only whitespace still count as nonempty.

Student numbers are printed as rounded integers, followed by a tab and the grade. Decimal parsing uses the default Scanner locale. A nonexistent filename prints a message; missing or malformed numeric fields can interrupt parsing or leave unfilled rows at zero.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/text`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
