data = list(map(int, input().split()))

result = 0

for d in data:
    result += d * d

print(result % 10)