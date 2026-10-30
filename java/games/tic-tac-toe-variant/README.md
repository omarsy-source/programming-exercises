# Tic Tac Toe Variant

[Collection](../../../README.md) / [Java index](../../README.md) / [games](../README.md) · [Compiler source list](sources.txt)

An alternative Tic-Tac-Toe implementation.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Player.java](src/Player/Player.java) | `Player.Player` |
| [TicTacToe.java](src/Player/TicTacToe.java) | `Player.TicTacToe` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Player.Player
```

## Two entry points

`Player.Player`, shown above, is a fixed helper demonstration. It prints an empty 3-by-3 board, reports `Freie Felder: true`, fills its first row with `X`, and reports `Horizontal: true`. It does not ask for moves.

To launch the interactive game instead, use:

```bash
java -cp out Player.TicTacToe
```

Enter a board size such as `3`, followed by zero-based row and column numbers for each move. `X` starts. For a 3-by-3 board, `0 0` selects the top-left cell.

## Existing limitations

The interactive game's `hasWon` method calls the horizontal and vertical checks only. Although `Player` defines a diagonal-check helper, that helper is not used by the game, so a diagonal alone does not end play. The diagonal helper also hardcodes column `2` for the second diagonal.

Board sizes and coordinate bounds are not validated. Choosing an occupied cell recursively starts another game loop rather than simply retrying within the current loop.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/spiel`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
