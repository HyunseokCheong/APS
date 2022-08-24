# input
N, K = map(int, input().split())
coin = []
for i in range(N):
    coin.append(int(input()))

# implement
cnt = 0
for i in range(N - 1, -1, -1):
    if coin[i] > K:
        continue
    else:
        temp = K // coin[i]
        cnt += temp
        K -= coin[i] * temp
    if K == 0:
        print(cnt)
        break