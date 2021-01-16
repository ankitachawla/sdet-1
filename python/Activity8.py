numbers= list(input("Enter your list of numbers:").split(","))
firstElement = numbers[0]
lastElement = numbers[-1]

if(firstElement == lastElement):
  print(True)
else:
    print(False)