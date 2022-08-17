for tc in range(int(input())):
    N = int(input())
    nums = [[0] * N for _ in range(N)]
    print(f'#{tc + 1}')

    for i in range(N):
        for j in range(N):
            if j == 0 or i == j:
                nums[i][j] = 1
                print(nums[i][j], end=' ')
            elif i > j:
                nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j]
                print(nums[i][j], end=' ')
            else:
                print()
                break
    print()
