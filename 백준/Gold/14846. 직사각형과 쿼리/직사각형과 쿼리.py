import sys

read = sys.stdin.readline
N = int(read())
mtx = [[0] * (N + 1)] + [[0] + list(map(int, read().split())) for _ in range(N)]
d = [[[0] * 11 for _ in range(N + 1)] for _ in range(N + 1)]
for i in range(1, N + 1):
    for j in range(1, N + 1):
        for k in range(1, 11):
            d[i][j][k] += d[i - 1][j][k] + d[i][j - 1][k] - d[i - 1][j - 1][k] + int(mtx[i][j] == k)
Q = int(read())
for _ in range(Q):
    x1, y1, x2, y2 = map(int, read().split())
    ans = 0
    for k in range(1, 11):
        if d[x2][y2][k] - d[x2][y1 - 1][k] - d[x1 - 1][y2][k] + d[x1 - 1][y1 - 1][k]:
            ans += 1
    print(ans)
