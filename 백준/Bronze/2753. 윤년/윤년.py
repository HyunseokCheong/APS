y = int(input())

result = 0

if y % 4 == 0 and y % 400 == 0:
    result = 1

if y % 4 == 0 and y % 100 != 0:
    result = 1

print(result)