data = 1
for _ in range(3):
    data *= int(input())

arr = [0] * 10

for d in str(data):
    arr[int(d)] += 1

for a in arr:
    print(a)