# Das Modul für Zufallszahlen laden.
import random

# Die Anzahl der Kugeln pro Ziehung festlegen.
draw_count = 7

# Weitere Ziehungen erlauben, bis der Benutzer sie beendet.
running = True

# Die äußere Schleife führt vollständige Ziehungen durch.
while running:

    # Die Zahlen von 1 bis 20 vorbereiten und die 9 entfernen.
    # Damit bleiben 19 verfügbare Kugeln übrig.
    numbers = list(range(1, 21))
    numbers.remove(9)

    # Bei jeder neuen Ziehung den Kugelzähler auf null setzen.
    i = 0

    # Mit einer leeren Liste für die Namen beginnen.
    drawn_balls = []

    # In der inneren Schleife sieben Kugeln ziehen.
    while i < draw_count:

        # Einen zufälligen gültigen Listenindex auswählen.
        index = random.randrange(len(numbers))

        # Die Kugel am gewählten Index lesen.
        ball = numbers[index]

        # Die Kugel zur Liste der gezogenen Werte hinzufügen.
        drawn_balls.append(ball)

        # Die Kugel aus den verfügbaren Werten entfernen, damit sie nicht erneut gezogen wird.
        numbers.remove(ball)

        # Den Zähler nach der Ziehung um eins erhöhen.
        i += 1

    # Nach der Ziehung die Zahlen absteigend sortieren.
    drawn_balls.sort(reverse=True)

    # Die gezogenen Kugeln ausgeben.
    print("Gezogene Kugeln:", drawn_balls)

    # Nachfragen, ob eine weitere Ziehung gewünscht ist.
    answer = input("Weiter? (ja/nein): ")

    if answer == "ja":
        running = True
    else:
        running = False