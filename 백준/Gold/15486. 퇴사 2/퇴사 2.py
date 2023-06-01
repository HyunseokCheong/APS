import sys

input = sys.stdin.readline
'''
n : 일 (1 <= n < 1_5000_000)
t : 상담 완료 기간 (1 <= t <= 50)
p : 상담 금액 (1 <= p <= 1_000)
'''
n = int(input())
t, p = [], []
dp = [0] * (n + 1)
for _ in range(n):
    a, b = map(int, input().split())
    t.append(a)
    p.append(b)
m = 0
for i in range(n):
    m = max(m, dp[i])
    if i + t[i] > n:
        continue
    dp[i + t[i]] = max(m + p[i], dp[i + t[i]])
print(max(dp))