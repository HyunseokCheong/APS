for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))

    nums.sort()
    answer = nums[-1] + nums[-2] - (nums[0] + nums[1])
    print(answer)