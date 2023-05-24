n, k = map(int, input().split())
arr = list(map(int, input().split()))

tmp = sum(arr[:k])
res = tmp
for i in range(k, n):
    tmp += arr[i] - arr[i - k]
    res = max(res, tmp)
print(res)
