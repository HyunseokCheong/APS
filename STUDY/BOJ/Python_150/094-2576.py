result = 0
min_value = 0

for i in range(7):
    num = int(input())
    if num % 2 != 0:
        result += num
        if min_value == 0 or num < min_value:
            min_value = num

if result == 0:
    print(-1)
else:
    print(result, min_value, sep='\n')