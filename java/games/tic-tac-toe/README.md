# Tic Tac Toe

[Collection](../../../README.md) / [Java index](../../README.md) / [games](../README.md) · [Compiler source list](sources.txt)

A Tic-Tac-Toe implementation.

Compiles with JDK 17.

## Source files

| File | Entry point |
| --- | --- |
| [Player.java](src/Exercise02/Player.java) | `Exercise02.Player` |
| [TicTacToe.java](src/Exercise02/TicTacToe.java) | `Exercise02.TicTacToe` |

## Compile and run

Open a terminal in this project folder. Compile using the supplied argument file:

```bash
javac -encoding UTF-8 -d out @sources.txt
```

Run one of the entry points listed above, for example:

```bash
java -cp out Exercise02.TicTacToe
```

## Playing the console version

Use `Exercise02.TicTacToe` to start the game. `Exercise02.Player` has an empty `main` method and produces no output when run directly.

Enter a board size such as `3`, then enter a row and column for each move. Coordinates are zero-based: on a 3-by-3 board, `0 0` selects the top-left cell and `2 2` selects the bottom-right cell. Player `X` moves first; accepted moves alternate between `X` and `O`.

## Existing game limitations

The prompt requests an odd board size, but the code does not validate that condition or coordinate bounds. Win detection only checks horizontal and vertical lines, not diagonals. Those scans keep updating a shared result while visiting later lines, so an earlier winning row or column may be missed. Choosing an occupied cell starts another recursive game loop.

These are existing limitations of the implementation; the example should not be treated as a complete rules-correct game.

## Import notes

Identifiers use English and source explanations use German. Existing calculations, conditions, demo values, and output literals are preserved. Some examples intentionally remain incomplete or have existing behavioral limitations.

Original source group: `Pro/Programmieren/AufgabeBlatt09`. See the [collection validation report](../../../docs/VALIDATION.md) for the full verification scope.
