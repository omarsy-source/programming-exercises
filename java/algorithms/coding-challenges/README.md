# Coding Challenges

[Collection](../../../README.md) / [Java index](../../README.md) / [algorithms](../README.md) · [Compiler source list](sources.txt)

Small algorithm and numeric challenge solutions.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [AreaOfSquare.java](src/easy/AreaOfSquare.java) | `easy.AreaOfSquare` |
| [FastingHours.java](src/easy/FastingHours.java) | `easy.FastingHours` |
| [Forms.java](src/easy/Forms.java) | `easy.Forms` |
| [PrimesBetween.java](src/easy/PrimesBetween.java) | `easy.PrimesBetween` |
| [Qs.java](src/easy/Qs.java) | `easy.Qs` |
| [TwoSum.java](src/easy/TwoSum.java) | `easy.TwoSum` |
| [sumEid.java](src/easy/sumEid.java) | `easy.sumEid` |
| [module-info.java](src/module-info.java) | Supporting class, interface, test, or module descriptor |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out easy.AreaOfSquare
```

## Fixed-input examples

After compiling, these commands run the values already defined in each source file; neither example reads terminal input.

| Command | Built-in example | Output |
| --- | --- | --- |
| `java -cp out easy.AreaOfSquare` | Side length `3`, multiplied by itself | `9` |
| `java -cp out easy.TwoSum` | Array `[1, 6, 9, 5, 8, 7, 3]`, target `10` | `[0, 2]` |

`TwoSum` returns zero-based **indices**, not the values: positions `0` and `2` contain `1` and `9`. Its nested loops return the first matching pair of distinct indices, or an empty array when no pair matches.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/leetcode/Solution`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
