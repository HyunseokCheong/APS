n, c, r = map(int, input().split())
c = max(c, n - c)
r = max(r, n - r)
print(c * r * 4)