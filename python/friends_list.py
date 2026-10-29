# Mit einer leeren Liste für die Namen beginnen.
name = []

# Diese Variable steuert, ob die Eingabeschleife weiterläuft.
running = True

# Namen einlesen, bis eine leere Eingabe die Schleife beendet.
while running:

    # Den nächsten Namen von der Konsole einlesen.
    answer = input("Gib einen Namen: ")

    # Eine leere Eingabe beendet die weitere Namenseingabe.
    if answer == "":
        running = False

    else:
        # Den Namen am Ende der Liste anfügen.
        name.append(answer)

        # Die bisher eingegebenen Namen anzeigen.
        print(name)

# Nach der Eingabe die Reihenfolge der Liste einmal umkehren.
name.reverse()

# Die Liste abschließend in umgekehrter Reihenfolge ausgeben.
print(name)