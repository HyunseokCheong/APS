N = int(input())
S = list(map(int, input().split()))
cnt = 0
S.sort()
for i in range(N):
    for j in range(i + 1):
        cnt += S[j]
print(cnt)