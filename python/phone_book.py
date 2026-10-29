# Eine feste Telefonnummer einem Beispielnamen zuordnen.
def find_name (num):
    if num == 11111111:
        print("Amal")
    elif num == 22222222:
        print("John")
    elif num == 33333333:
        print("Alice")
    else:
        print("Name not found")

print("Enter a number:")
num = int (input())
find_name(num)