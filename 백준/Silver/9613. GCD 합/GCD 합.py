def uclid(x, y):
    while y != 0:
        (x, y) = (y, x % y)
    return x


t = int(input())
for tc in range(t):
    arr = list(map(int, input().split()))
    n = arr[0]
    nums = arr[1:]
    ans = 0
    for i in range(n - 1):
        for j in range(i + 1, n):
            ans += uclid(nums[i], nums[j])
    print(ans)
