fruit={
    "Mango": 1,
    "Banana":2,
    "Apple":3,
    "Papaya":4
    }
Fruit_check= input("which fruit are you looking for? ")

if (Fruit_check in fruit):
    print("Yes" , "fruit is available")
else:
    print("No", "fruit is not available")