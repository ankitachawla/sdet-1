def calculateSum(numbers):
    sum = 0
    for number in numbers:
    sum += number
    return sum

numList = [10,20,30,40]
result = calculateSum(numList)
print("The sum of the element is:" + str(result))