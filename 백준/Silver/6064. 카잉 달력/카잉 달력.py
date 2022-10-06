def solve(m, n, x, y):
    while x <= m * n:
        if (x - y) % n == 0:
            return x
        x += m
    return -1


t = int(input())
for tc in range(t):
    m, n, x, y = map(int, input().split())
    print(solve(m, n, x, y))