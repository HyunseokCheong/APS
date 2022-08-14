N, K = map(int, input().split())
coins = []
for i in range(N):
    coins.append(int(input()))
coins.sort(reverse=True)

cnt = 0
for i in coins:
    if K >= i:
        cnt += K // i
        K %= i
        if K == 0:
            break

print(cnt)