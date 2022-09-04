arr = [[0] * 100 for i in range(100)]

for i in range(int(input())):
    M, N = map(int, input().split())
    for j in range(M, M + 10):
        for k in range(N, N + 10):
            arr[j][k] = 1

ans = 0
for i in arr:
    ans += i.count(1)

print(ans)