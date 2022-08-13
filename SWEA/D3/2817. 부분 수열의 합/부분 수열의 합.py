# input
for tc in range(int(input())):
    N, K = map(int, input().split())
    nums = list(map(int, input().split()))

    # implement
    cnt = 0
    temp = []
    for i in range(0, N):
        temp.append(nums[i])
        if nums[i] == K:
            cnt += 1
        for j in range(len(temp) - 1):
            if nums[i] + temp[j] < K:
                temp.append(nums[i] + temp[j])
            elif nums[i] + temp[j] == K:
                cnt += 1

    # output
    print(f'#{tc + 1} {cnt}')