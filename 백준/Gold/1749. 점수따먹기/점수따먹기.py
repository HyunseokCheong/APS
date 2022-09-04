import sys

input = sys.stdin.readline
N, M = map(int, input().split())
nums = [list(map(int, input().split())) for _ in range(N)]

# prefix
preifx_sum = [[0] * (M + 1) for _ in range(N + 1)]
for i in range(1, N + 1):
    for j in range(1, M + 1):
        preifx_sum[i][j] = preifx_sum[i - 1][j] + preifx_sum[i][j - 1] + nums[i - 1][j - 1] - preifx_sum[i - 1][j - 1]

# 200X200 => - 10000 => -4억
ans = - 400000001
for x1 in range(1, N + 1):
    for y1 in range(1, M + 1):
        for x2 in range(x1, N + 1):
            for y2 in range(y1, M + 1):
                ans = max(ans,
                          preifx_sum[x2][y2] - preifx_sum[x2][y1 - 1] - preifx_sum[x1 - 1][y2] + preifx_sum[x1 - 1][
                              y1 - 1])
print(ans)
