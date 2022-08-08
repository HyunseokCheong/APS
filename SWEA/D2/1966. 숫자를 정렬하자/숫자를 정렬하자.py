def new_sort(nums):
    for j in range(len(nums), 0, -1):
        for k in range(1, j):
            if nums[k - 1] > nums[k]:
                nums[k - 1], nums[k] = nums[k], nums[k - 1]
    return nums

T = int(input())
for i in range(T):
    N = int(input())
    nums = list(map(int, input().split()))
    nums = new_sort(nums)
    print(f'#{i + 1}', *nums, end=' ')
    print()