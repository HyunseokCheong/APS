def rec(idx, depth):
    global ans
    if idx == N:
        ans = max(ans, depth)
        return
    T = TM[idx][0]
    M = TM[idx][1]
    if T + idx <= N:
        rec(T + idx, M + depth)
    rec(idx + 1, depth)


N = int(input())
TM = [list(map(int, input().split())) for _ in range(N)]
ans = 0
for i in range(N):
    rec(i, 0)
print(ans)