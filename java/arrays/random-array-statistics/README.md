# Random Array Statistics

[Collection](../../../README.md) / [Java index](../../README.md) / [arrays](../README.md) · [Compiler source list](sources.txt)

Random arrays, sums, means, and a console menu.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Exercise01.java](src/exercise/Exercise01.java) | `exercise.Exercise01` |
| [Exercise02.java](src/exercise/Exercise02.java) | `exercise.Exercise02` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out exercise.Exercise01
```

## Console workflow

`exercise.Exercise01` asks for an array length, generates values from 1 through 9, and then prints the sum, array, and mean. The separate number announced before the array is filled is an additional random draw; it is not an array element inserted by that announcement.

To use the menu version, run:

```bash
java -cp out exercise.Exercise02
```

| Option | Action |
| --- | --- |
| `1` | Creates a new random array after asking for its length. |
| `2` | Prints the current array's sum. |
| `3` | Prints the current array's mean. |

Create an array with option `1` before requesting statistics. The loop has no exit option because its `repeat` flag stays true; stop the process with Ctrl+C. Choosing `2` or `3` before creating an array also falls through to later switch branches and may print multiple messages, including `404`.

A length of zero produces an empty array with sum `0` and mean `NaN`. Negative lengths and nonnumeric input are not handled.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabeBlatt08`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
