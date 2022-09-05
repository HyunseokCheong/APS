N = int(input())
arr = [0, 1]

for i in range(2, N + 1):
    arr.append(arr[-2] + arr[-1])

print(arr[N])