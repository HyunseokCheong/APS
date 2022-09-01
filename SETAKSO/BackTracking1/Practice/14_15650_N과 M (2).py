N, K = map(int, input().split())

girls = [0 for _ in range(7)]
boys = [0 for _ in range(7)]

for i in range(N):
    S, H = map(int, input().split())
    if S == 0:
        girls[H] += 1
    else:
        boys[H] += 1

cnt = 0
for i in range(1, 7):
    if girls[i] > 0:
        if girls[i] % K == 0:
            cnt += girls[i] // K
        else:
            cnt += girls[i] // K + 1
    if boys[i] > 0:
        if boys[i] % K == 0:
            cnt += boys[i] // K
        else:
            cnt += boys[i] // K + 1

print(cnt)