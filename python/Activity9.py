number1= list(input("Enter your list of numbers:").split(" "))
number2= list(input("Enter your list of numbers:").split(" "))
List = []
for num in number1:
    if (num % 2 != 0):
        List.append(num)
for num in number2:
    if (num % 2 == 0):
        List.append(num)
print("List is:")
print(List)