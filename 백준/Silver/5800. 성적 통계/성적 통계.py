K = int(input())

for i in range(K):
    nums = list(map(int, input().split()))
    del nums[0]
    nums.sort()
    gap = []
    print('Class', i + 1)
    for j in range(len(nums) - 1):
        gap.append(nums[j + 1] - nums[j])

    print(f'Max {max(nums)}, Min {min(nums)}, Largest gap {max(gap)}')
