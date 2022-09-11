N, S = map(int, input().split())
nums = list(map(int, input().split()))
i, j = 0, 0
res = nums[0]
ans = 1e9

while True:
    if res >= S:
        res -= nums[i]
        ans = min(ans, j - i + 1)
        i += 1
    else:
        j += 1
        if j == N:
            break
        res += nums[j]

if ans == 1e9:
    print(0)
else:
    print(ans)