nums = []

for i in range(5):
    N = int(input())
    nums.append(N)

nums.sort()

print(sum(nums) // 5)
print(nums[2])