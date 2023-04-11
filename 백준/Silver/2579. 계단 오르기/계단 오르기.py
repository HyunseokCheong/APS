n = int(input())
sq = [int(input()) for _ in range(n)]
dp = [0] * n

if n <= 2:
    print(sum(sq))
else:
    dp[0], dp[1] = sq[0], sq[0] + sq[1]
    for i in range(2, n):
        dp[i] = max(dp[i - 3] + sq[i - 1] + sq[i], dp[i - 2] + sq[i])
    print(dp[-1])