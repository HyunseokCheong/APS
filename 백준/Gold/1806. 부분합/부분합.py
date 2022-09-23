n, s = map(int, input().split())
arr = list(map(int, input().split()))

left, right = 0, 1
val = arr[0]
ans = 0
while left < n and right <= n:
    if val < s:
        if right < n:
            val += arr[right]
            right += 1
        else:
            break
    elif val >= s:
        if right - left < ans or ans == 0:
            ans = right - left
        val -= arr[left]
        left += 1

print(ans)
