N = int(input())
nums = 0
if N == 0:
    print(1)
else:
    for i in range(1, N + 1):
        if nums == 0:
            nums += i
        else:
            nums *= i
    print(nums)