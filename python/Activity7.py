numbers= list(input("Enter your list of numbers:").split(","))
total=0

for number in numbers:
    total += int(number)
print(total)