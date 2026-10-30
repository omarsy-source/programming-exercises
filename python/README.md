# Python exercises

[Back to the collection](../README.md)

Seven independent console exercises using the Python standard library. Identifiers use English; comments use simple German.

| Script | Purpose | Usage |
| --- | --- | --- |
| [user_management.py](user_management.py) | Nested dictionaries with two example users. | [Example](#nested-dictionary-example) |
| [friends_list.py](friends_list.py) | Reads names until an empty input, then reverses their order. | [Example](#friends-list-example) |
| [birthday.py](birthday.py) | Demonstrates a nested tuple with a name and example date. | [Example](#nested-tuple-example) |
| [james_bond.py](james_bond.py) | Splits and recombines first and last names using two approaches. | [Example](#name-splitting-example) |
| [lottery.py](lottery.py) | Draws seven distinct numbers and allows another draw. | [Example](#lottery-example) |
| [phone_book.py](phone_book.py) | Looks up a fixed example number using conditions. | [Example](#phone-book-example) |
| [time_calculation.py](time_calculation.py) | Reads time tuples and defines a duration function without calling it. | [Example](#time-input-example) |

## Run

Open a terminal in this folder and run, for example:

```bash
python friends_list.py
```

Use `python3` instead if required by your installation.

## Validation and retained behavior

All seven scripts were compared with their original versions using representative input; output matched. The time example retains `eval()` input and its uncalled calculation function, and the user-management example retains its sample dictionary keys.

## Friends-list example

Run `friends_list.py`, enter `Omar`, then `Lina`, then press Enter without typing a name. The script displays the list after each name and finishes with:

```text
['Lina', 'Omar']
```

An empty first input finishes immediately and prints `[]`.

## Lottery example

Run `python lottery.py` to draw seven distinct numbers from 1 through 20, excluding `9`. The available pool therefore contains 19 numbers. Results are printed in descending order and vary between runs.

At `Weiter? (ja/nein):`, enter exactly `ja` for another draw. Any other input ends the program. Each new draw restores the full pool, so a number can appear again in a later draw, while remaining unique within a single draw.

## Phone-book example

Run `python phone_book.py` and enter an integer when prompted. The lookup uses three fixed example mappings:

| Input | Output |
| --- | --- |
| `11111111` | `Amal` |
| `22222222` | `John` |
| `33333333` | `Alice` |
| Any other integer | `Name not found` |

This example does not save contacts or search an external address book. Nonnumeric input fails during the `int()` conversion because input errors are not handled.

## Time-input example

Run `python time_calculation.py` and enter four numeric values in order: start hour, start minute, end hour, end minute. For inputs `8`, `0`, `9`, and `30`, it prints the tuples `(8, 0)` and `(9, 30)`.

The script defines `calculate_minutes(start, end)` but never calls it, so running the file does not print a duration. The function's overnight branch is selected by comparing the hours only; hour and minute ranges are not validated. Use numeric literals for this exercise: each prompt passes its input through `eval()`.

## Name-splitting example

Run `python james_bond.py`. It uses the fixed string `James Bond`, requests no input, and prints the same line twice:

```text
Bond, James Bond
Bond, James Bond
```

The first version uses fixed slices for a five-character first name and a four-character last name. The second finds the first space and slices around its position. The repeated output demonstrates two approaches to splitting this particular name; it is not a general name parser.

## Nested-tuple example

Run `python birthday.py`. It requests no input and prints `<class 'tuple'>` twice: once for the date tuple and once for the outer tuple containing the name and date.

The date is stored as `(day, month, year)`. The outer tuple has the shape `(name, date)`, so index `0` selects the name and index `1` selects the complete date tuple. The final message prints that tuple directly, retaining its parentheses and commas rather than formatting a calendar date. The name and date are fixed example values from the source.

## Nested-dictionary example

Run `python user_management.py`. It requests no input and prints one nested dictionary containing the two fixed users `anna` and `hugo`.

The outer keys select a user's dictionary; the inner keys are `name`, `address`, `matrnr`, and `email`. For example, `users["anna"]["address"]` selects `Flensburg`. The script only constructs and prints these sample records; it does not implement account creation, login, editing, or persistent storage.
