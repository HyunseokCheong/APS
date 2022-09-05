nums = list(map(int, input().split()))
min_num = min(nums)

while True:
    cnt = 0
    for i in range(len(nums)):
        if min_num % nums[i] == 0:
            cnt += 1
    if cnt >= 3:
        print(min_num)
        break
    min_num += 1