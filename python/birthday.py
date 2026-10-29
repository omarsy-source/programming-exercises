# Name der Person.
name = "Omar A"

# Das Beispieldatum als Tupel aus Tag, Monat und Jahr speichern.
date = (14, 6, 2000)

# Den Datentyp des Datums ausgeben.
print(type(date))

# Den Namen und das Datum in einem weiteren Tupel zusammenfassen.
birthday_info = (name, date)

# Den Typ des verschachtelten Tupels ausgeben.
print(type(birthday_info))

# Index 0 enthält den Namen, Index 1 das vollständige Datum.
# Die Werte in Text umwandeln und zur Ausgabe verbinden.
print(str(birthday_info[0]) + " hat am " +
      str(birthday_info[1]) + " Geburtstag.")