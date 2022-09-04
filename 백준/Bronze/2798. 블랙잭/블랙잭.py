N, M = map(int, input().split())
arr = list(map(int, input().split()))
a = len(arr)
ans = 0
for i in range(1, a - 2):
    for j in range(i + 1, a - 1):
        for k in range(j + 1, a):
            if (arr[i] + arr[j] + arr[k] > M):
                continue
            else:
                ans = max(ans, arr[i] + arr[j] + arr[k])
print(ans)