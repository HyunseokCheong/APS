for tc in range(int(input())):
    wallet = 0
    N = int(input())
    nums = list(map(int, input().split()))
    max_price = nums[-1]
    for i in range(N - 2, -1, -1):
        if nums[i] > max_price:
            max_price = nums[i]
        elif nums[i] < max_price:
            wallet += max_price - nums[i]
    print(f'#{tc + 1} {wallet}')