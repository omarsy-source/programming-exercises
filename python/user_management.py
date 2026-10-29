# Die Beispieldaten der Benutzerin Anna in einem Dictionary speichern.
anna = {
    "name": "Anna",                  # Name der Person.
    "address": "Flensburg",          # Ort der Person.
    "matrnr": "123456",              # Beispiel einer Hochschulnummer.
    "email": "anna@gmail.com"        # Beispiel einer E-Mail-Adresse.
}

# Die Beispieldaten von Hugo in einem Dictionary speichern.
hugo = {
    "name": "Hugo",
    "address": "Schleswig",
    "matrnr": "258975",
    "email": "hugo@gmail.com"
}

# Die einzelnen Benutzerdaten in einem gemeinsamen Dictionary sammeln.
# Der Benutzername ist der Schlüssel; als Wert wird das jeweilige Dictionary gespeichert.
users = {
    "anna": anna,
    "hugo": hugo
}

# Das vollständige Benutzer-Dictionary ausgeben.
print(users)