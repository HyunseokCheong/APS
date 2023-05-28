a, b, n, w = map(int, input().split())

c, x, y = 0, 0, 0
for i in range(1, n):
    if a * i + b * (n - i) == w:
        c += 1
        x = i
        y = n - i

if c != 1:
    print(-1)
else:
    print(x, y)