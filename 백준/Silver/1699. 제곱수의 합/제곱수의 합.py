n = int(input())
dp = [0 for _ in range(n + 1)]
sq = [i * i for i in range(1, 317)]

for i in range(1, n + 1):
    li = []
    for j in sq:
        if j > i:
            break
        li.append(dp[i - j])
    dp[i] = min(li) + 1

print(dp[n])