nums = list(map(int, input().split()))

res = 1
for i in nums:
    res *= i

for i in range(min(nums), res + 1):
    cnt = 0
    for j in nums:
        if i % j == 0:
            cnt += 1
    if cnt >= 3:
        print(i)
        break
