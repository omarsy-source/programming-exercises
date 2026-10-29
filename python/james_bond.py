# Den vollständigen Namen in einer Zeichenkette speichern.
name = "James Bond"

# Die ersten fünf Zeichen als Vornamen ausschneiden.
first_name = name[0:5]

# Die letzten vier Zeichen als Nachnamen ausschneiden.
last_name = name[-4:]

# Nachname und Vorname zum bekannten Spruch zusammensetzen.
print(last_name + ", " + first_name + " " + last_name)


# Die Position des ersten Leerzeichens suchen.
position = name.find(" ")

# Alle Zeichen vor dem Leerzeichen als Vornamen übernehmen.
first_name = name[:position]

# Die Zeichen nach dem Leerzeichen als Nachnamen übernehmen.
last_name = name[position + 1:]

# Den Spruch mit der zweiten Zerlegungsmethode ausgeben.
print(last_name + ", " + first_name + " " + last_name)