arr = [0] * 43

for _ in range(10):
    num = int(input())
    arr[num % 42] += 1

result = 0
for a in arr:
    if a != 0:
        result += 1

print(result)