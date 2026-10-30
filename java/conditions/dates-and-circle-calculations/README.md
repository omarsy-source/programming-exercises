# Dates And Circle Calculations

[Collection](../../../README.md) / [Java index](../../README.md) / [conditions](../README.md) · [Compiler source list](sources.txt)

Month selection and circle calculations.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise04.java](src/worksheet04/Exercise04.java) | `worksheet04.Exercise04` |
| [Exercise05.java](src/worksheet04/Exercise05.java) | `worksheet04.Exercise05` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out worksheet04.Exercise04
```

## Inputs and examples

### Circle calculation

Run `worksheet04.Exercise04`, enter the radius, then enter exactly `Umfang` for circumference or `Fläche` for area. These choices are case-sensitive; other text prints `404`.

The program uses `3.14` for pi. With radius `1`, `Umfang` produces `6.28`, while `Fläche` produces `3.14`. Negative radii and malformed numeric input are not validated.

### Month selection

Run the date exercise with:

```bash
java -cp out worksheet04.Exercise05
```

Enter the year, the capitalized German month name, and the day, in that order. For example, `2026`, `Oktober`, and `30` produce `30.Oktober.2026`.

Month spelling is checked against `Januar` through `Dezember`, including `März`. The program only validates the month name; it does not check day ranges or leap years, so an impossible calendar date can still be printed.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabenBaltt5`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
