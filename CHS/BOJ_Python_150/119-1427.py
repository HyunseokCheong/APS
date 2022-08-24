nums = list(input())
N = len(nums)
for i in range(N - 1, 0, -1):
    for j in range(0, i):
        if nums[j] < nums[j + 1]:
            nums[j], nums[j + 1] = nums[j + 1], nums[j]

for i in range(0, N):
    print(nums[i], end='')