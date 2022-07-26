N, S = map(int, input().split())
seq = list(map(int, input().split()))
i, j = 0, 0
res = seq[0]
ans = 100001

while True:
    if res >= S:
        res -= seq[i]
        ans = min(ans, j - i + 1)
        i += 1
    else:
        j += 1
        if j == N:
            break
        res += seq[j]

print(0) if ans == 100001 else print(ans)
