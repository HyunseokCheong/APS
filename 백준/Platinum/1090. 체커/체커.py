import sys

input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

ans = [1e9] * (n + 1)

for i in range(n):
    for j in range(n):
        mid_col, mid_row = arr[i][0], arr[j][1]

        dist = []
        for k in range(n):
            dist.append(abs(mid_col - arr[k][0]) + abs(mid_row - arr[k][1]))
        dist.sort()

        mnv = 0
        for k in range(n):
            mnv += dist[k]
            ans[k + 1] = min(mnv, ans[k + 1])

print(*ans[1:])
