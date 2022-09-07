arr = []

N = int(input())
for i in range(N):
    n, d, m, y = input().split()
    d, m, y = map(int, (d, m, y))
    arr.append((y, m, d, n))
arr.sort()
print(arr[-1][3])
print(arr[0][3])