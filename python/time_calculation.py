# Die Uhrzeiten als Tupel speichern; calculate_minutes() ist definiert, wird hier aber nicht aufgerufen.
start_hour = eval(input("Geben Sie die Startstunde ein: "))
start_minute = eval(input("Geben Sie die startminute ein: "))
start = (start_hour, start_minute)

print (start)

end_hour = eval(input("Geben Sie die Endstunde ein: "))
end_minute = eval(input("Geben Sie die Endminute ein: "))
end = (end_hour, end_minute)

working_minutes = 0
print (end)

def calculate_minutes (start, end):
    start_hour, start_minute = start
    end_hour , end_minute = end
    # Stunden in Minuten umrechnen, damit die Werte vergleichbar sind.
    minutes_per_day = 24 * 60
    start_in_minutes = (start_hour * 60) + start_minute
    end_in_minutes = (end_hour * 60) + end_minute
    minute_difference = start_in_minutes - end_in_minutes
    # Bei einer größeren Startstunde wird die Endzeit dem nächsten Tag zugeordnet.
    if start_hour > end_hour:
        working_minutes = minutes_per_day - minute_difference
        print("Du hast " + str(working_minutes) + " Minuten  Nachtschicht gearbeitet")
    else :
        working_minutes = abs((minute_difference))
        print("Du hast " + str(working_minutes) + " Minuten gearbeitet")