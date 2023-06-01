import sys

input = sys.stdin.readline
'''
1. X % 3 == 0 이면, 3으로 나눈다.
2. X % 2 == 0 이면, 2로 나눈다.
3. 1을 뺀다.
'''
n = int(input())
dp = [[0, []] for _ in range(n + 1)]
dp[1][0] = 0
dp[1][1] = [1]

for i in range(2, n + 1):
    # 1을 뺀 경우
    dp[i][0] = dp[i - 1][0] + 1
    dp[i][1] = dp[i - 1][1] + [i]
    # 3으로 나누어 떨어지는 경우
    if i % 3 == 0 and dp[i // 3][0] + 1 < dp[i][0]:
        dp[i][0] = dp[i // 3][0] + 1
        dp[i][1] = dp[i // 3][1] + [i]
    # 2로 나누어 떨어지는 경우
    if i % 2 == 0 and dp[i // 2][0] + 1 < dp[i][0]:
        dp[i][0] = dp[i // 2][0] + 1
        dp[i][1] = dp[i // 2][1] + [i]

print(dp[n][0])
print(*reversed(dp[n][1]))