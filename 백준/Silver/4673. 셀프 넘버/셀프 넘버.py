nums = set(range(1, 10001))
new_nums = set()
for i in range(1, 10001):
    for j in str(i):
        i += int(j)
    new_nums.add(i)
for i in sorted(nums - new_nums):
    print(i)
