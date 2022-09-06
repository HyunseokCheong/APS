for tc in range(int(input())):
    nums = list(map(int, input().split()))
    sum_even = 0
    min_even = 0
    for i in range(0, 7):
        if nums[i] % 2 == 0:
            sum_even += nums[i]
            if min_even == 0 or nums[i] < min_even:
                min_even = nums[i]
    print(sum_even, min_even)