arr = [0] * 30

for _ in range(28):
    n = int(input())
    arr[n-1] = 1

for i in range(len(arr)):
    if arr[i] == 0:
        print(i + 1)
