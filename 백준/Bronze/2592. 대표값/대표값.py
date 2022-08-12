nums = []
for i in range(10):
    num = int(input())
    nums.append(num)

print(sum(nums) // 10)
print(max(nums, key=nums.count))