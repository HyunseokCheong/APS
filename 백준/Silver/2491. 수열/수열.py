N = int(input())
nums = list(map(int, input().split()))

dp1, dp2 = [1] * N, [1] * N
for i in range(1, N):
    if nums[i] <= nums[i - 1]:
        dp1[i] = max(dp1[i], dp1[i - 1] + 1)
    if nums[i] >= nums[i - 1]:
        dp2[i] = max(dp2[i], dp2[i - 1] + 1)
dp1 = max(dp1)
dp2 = max(dp2)
print(max(dp1, dp2))