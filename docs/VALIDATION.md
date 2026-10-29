# Validation

Validation was performed on 29 October 2026 using JDK 17 and Python 3.

## Scope

- The archive contains 368 Java source entries, 15 SQL scripts, and 7 Python scripts.
- Deduplication identified 61 Java source groups. Thirty complete, distinct source groups remain after consolidating 31 exact project copies (line-ending differences are normalized).
- All 266 distinct Java source contents are represented. Groups that differ in code are kept separately.
- Every Java file was compared token by token after the documented identifier mapping. Operators, statements, numeric values, character and string literals, and control flow are unchanged. German comments do not affect executable tokens.
- Python AST comparisons confirm the same syntax structure after identifier renaming. All seven representative executions produced identical output with the same inputs and random seed.
- SQL comparisons preserve every executable token, including identifiers and literals; only comments and file locations changed.

## Java builds

| Project | Original complete group | Renamed complete group | Notes |
| --- | --- | --- | --- |
| [hero-decorators](../java/oop/hero-decorators/README.md) | Pass | Pass |  |
| [library-model](../java/oop/library-model/README.md) | Pass | Pass |  |
| [people-and-inheritance](../java/oop/people-and-inheritance/README.md) | Pass | Pass |  |
| [exception-handling-and-grades](../java/exceptions/exception-handling-and-grades/README.md) | Pass | Pass |  |
| [interfaces-and-plugins](../java/oop/interfaces-and-plugins/README.md) | Pass | Pass |  |
| [generics-and-collections](../java/collections/generics-and-collections/README.md) | Pass | Pass |  |
| [state-and-decorators](../java/oop/state-and-decorators/README.md) | Pass | Pass |  |
| [threads-and-merge-sort](../java/algorithms/threads-and-merge-sort/README.md) | Pass | Pass |  |
| [bubble-sort](../java/algorithms/bubble-sort/README.md) | Pass | Pass |  |
| [arithmetic-and-arrays](../java/basics/arithmetic-and-arrays/README.md) | Pass | Pass |  |
| [worked-examples](../java/oop/worked-examples/README.md) | Pass | Pass |  |
| [coding-challenges](../java/algorithms/coding-challenges/README.md) | Pass | Pass |  |
| [text-practice](../java/basics/text-practice/README.md) | Pass | Pass |  |
| [max-value-test](../java/testing/max-value-test/README.md) | Existing failure | Same limitation | Existing missing dependencies or incomplete syntax; see project README. |
| [tic-tac-toe-variant](../java/games/tic-tac-toe-variant/README.md) | Pass | Pass |  |
| [practice](../java/fundamentals/practice/README.md) | Existing failure | Same limitation | 65 production sources compile separately. |
| [number-sequence](../java/loops/number-sequence/README.md) | Pass | Pass |  |
| [array-helpers-and-tests](../java/methods/array-helpers-and-tests/README.md) | Existing failure | Same limitation | 1 production source compiles separately. |
| [geometry-dash](../java/games/geometry-dash/README.md) | Pass | Pass |  |
| [scratch-snippet](../java/basics/scratch-snippet/README.md) | Existing failure | Same limitation | Existing missing dependencies or incomplete syntax; see project README. |
| [regular-expressions](../java/strings/regular-expressions/README.md) | Pass | Pass |  |
| [matrix-generation](../java/arrays/matrix-generation/README.md) | Pass | Pass |  |
| [random-array-statistics](../java/arrays/random-array-statistics/README.md) | Pass | Pass |  |
| [tic-tac-toe](../java/games/tic-tac-toe/README.md) | Pass | Pass |  |
| [grade-file-statistics](../java/files/grade-file-statistics/README.md) | Pass | Pass |  |
| [arithmetic-input-and-bmi](../java/basics/arithmetic-input-and-bmi/README.md) | Pass | Pass |  |
| [dates-and-circle-calculations](../java/conditions/dates-and-circle-calculations/README.md) | Pass | Pass |  |
| [calculator-and-patterns](../java/loops/calculator-and-patterns/README.md) | Pass | Pass |  |
| [digits-and-letter-replacement](../java/strings/digits-and-letter-replacement/README.md) | Pass | Pass |  |
| [range-candies-and-binary](../java/loops/range-candies-and-binary/README.md) | Pass | Pass |  |

## Runtime comparisons

83 deterministic Java executions and seven Python executions produced identical output before and after the update. Additional Java checks observe:

- One example prints fully qualified class names through reflection; its output follows the requested package rename (`Aufgabe03` to `Exercise03`).
- One logger prints the current timestamp, so runs at different times have different timestamp text.
- One nonterminating or long-running example reached the smoke-check timeout and was not treated as a successful runtime check.

Graphical gameplay, interactive random simulations, and the JUnit suites were not comprehensively tested. No MySQL server was available; SQL validation did not execute the scripts. Original build failures and behavior limitations were retained.

The [import map](import-map.json) maps every original source entry to its organized destination. It also identifies exact duplicated source groups.