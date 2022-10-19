arr = [0] * 10
res = 1
for i in range(3):
    res *= int(input())

for i in str(res):
    arr[int(i)] += 1

for i in range(10):
    print(arr[i])