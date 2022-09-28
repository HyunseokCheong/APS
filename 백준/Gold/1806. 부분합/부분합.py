n, s = map(int, input().split())
arr = list(map(int, input().split()))

l, r = 0, 1
val = arr[0]
ans = 0
while l < n and r <= n:
    if val < s:
        if r < n:
            val += arr[r]
            r += 1
        else:
            break
    elif val >= s:
        if r - l < ans or ans == 0:
            ans = r - l
        val -= arr[l]
        l += 1
print(ans)