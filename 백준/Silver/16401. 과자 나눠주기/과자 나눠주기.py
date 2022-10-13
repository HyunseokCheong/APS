m, n = map(int, input().split())
arr = sorted(list(map(int, input().split())))

s = 0
e = max(arr)
ans = 0

while s <= e:
    tot = 0
    mid = (s + e) // 2
    if mid == 0:
        tot = 0
        break
    for i in arr:
        if i >= mid:
            tot += (i // mid)

    if tot >= m:
        s = mid + 1
        ans = mid

    else:
        e = mid - 1

print(ans)
