a, b, n, w = map(int, input().split())
arr = []
for i in range(1, n):
    if a * i + b * (n - i) == w:
        arr.append(i)
        arr.append(n - i)
if len(arr) != 2:
    print(-1)
else:
    print(arr[0], arr[1])