for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))

    for i in range(N - 1, 0, -1):
        for j in range(0, i):
            if nums[j] > nums[j + 1]:
                nums[j], nums[j + 1] = nums[j + 1], nums[j]

    print(f'#{tc + 1}', end=' ')
    print(*nums)