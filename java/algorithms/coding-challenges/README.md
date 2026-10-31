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

## Prime range example

After compiling, run `java -cp out easy.PrimesBetween`. The main method uses the fixed inclusive range `1` to `20` and reads no terminal input.

Expected output:

```text
[2, 3, 5, 7, 11, 13, 17, 19]
```

`getPrimesBetween(a, b)` skips values below `2`, checks each candidate for divisors, and returns an array shortened to the number of primes found. The returned array contains the prime values themselves, with no unused trailing zeroes. The main method does not parse command-line arguments to change the range.

## Fasting duration example

After compiling, run `java -cp out easy.FastingHours`. It uses three fixed pairs of times and reads no terminal input:

| Start | End | Duration |
| --- | --- | --- |
| `04:30` | `18:30` | 14 hours |
| `04:29` | `18:31` | 14 hours, 2 minutes |
| `04:28` | `18:32` | 14 hours, 4 minutes |

The total is approximately `42.1` decimal hours, or 42 hours and 6 minutes. The program prints the unrounded `double`, so small floating-point rounding differences can appear in the displayed value.

The method parses hours and minutes around `:` and sums same-day differences. It does not add 24 hours for an overnight interval or validate matching array lengths and valid clock times.

## String type classification example

After compiling, run `java -cp out easy.Forms`. The main method passes the fixed string `"4.5"` to `input_type` and prints `double`; it takes no terminal input. The other declared strings are not passed to the method by this main routine.

For the three example strings, the method's behavior is:

| Value | Returned label |
| --- | --- |
| `"10"` | `integer` |
| `"4.5"` | `double` |
| `"Hallo"` | `string` |

It first tries `Integer.parseInt`, then tries `Double.parseDouble` if integer parsing throws `NumberFormatException`. The labels describe which parsing attempt succeeds; the method returns a label string, not the parsed numeric value.

## Month-to-quarter example

After compiling, run `java -cp out easy.Qs`. The main method calls `findQuarter(6)` and prints `2`, without terminal input.

| Month numbers | Returned quarter |
| --- | --- |
| `1, 2, 3` | `1` |
| `4, 5, 6` | `2` |
| `7, 8, 9` | `3` |
| `10, 11, 12` | `4` |

Other integer values cause `findQuarter` to throw `IllegalArgumentException` with a message beginning `Invalid month:`. The main method uses its fixed month value rather than parsing command-line arguments.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/leetcode/Solution`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
