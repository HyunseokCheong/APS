nums = []
sum_nums = 0
for i in range(5):
    num = int(input())
    nums.append(num)
    sum_nums += num

for i in range(4, 0, -1):
    for j in range(0, i):
        if nums[j] > nums[j + 1]:
            nums[j], nums[j + 1] = nums[j + 1], nums[j]

print(sum_nums // 5)
print(nums[2])
