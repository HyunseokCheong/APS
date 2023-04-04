import sys

input = sys.stdin.readline
n = int(input())
sq = list(map(int, input().split()))
dp = [[0] * n for _ in range(n)]

for i in range(n):
    dp[i][i] = 1
for i in range(n - 1):
    if sq[i] == sq[i + 1]:
        dp[i][i + 1] = 1
    else:
        dp[i][i + 1] = 0
for i in range(n - 2):
    for j in range(n - 2 - i):
        t = j + i + 2
        if sq[j] == sq[t] and dp[j + 1][t - 1] == 1:
            dp[j][t] = 1

m = int(input())
for i in range(m):
    s, e = map(int, input().split())
    print(dp[s - 1][e - 1])