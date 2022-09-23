k, n = map(int, input().split())
arr = [int(input()) for _ in range(k)]
s, e = 1, max(arr)
while s <= e:
    m = (s + e) // 2
    cnt = 0
    for i in arr:
        cnt += i // m
    if cnt >= n:
        s = m + 1
    else:
        e = m - 1
print(e)
