'''
현재 요소가 K인가?
현재 요소와 전 요소 중 하나의 합이 K인가?
현재 요소와 전 요소 중 여러 개의 합이 K인가?
합이 K 보다 작은 경우 탐색할 배열에 추가하고 탐색 범위를 늘려주면 OK
'''
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