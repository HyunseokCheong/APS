n, m = map(int, input().split())
arr = list(map(int, input().split()))

s = 1
e = max(arr)

while s <= e:
    mid = (s + e) // 2
    cnt = 0
    for i in arr:
        if i >= mid:
            cnt += i - mid
    if cnt >= m:
        s = mid + 1
    else:
        e = mid - 1
print(e)
