n, m = map(int, input().split())
arr = list(map(int, input().split()))
s, e = 0, 0
cnt = 0
while e <= n:
    res = sum(arr[s:e])
    if res == m:
        cnt += 1
        e += 1
    elif res < m:
        e += 1
    elif res > m:
        s += 1
print(cnt)
