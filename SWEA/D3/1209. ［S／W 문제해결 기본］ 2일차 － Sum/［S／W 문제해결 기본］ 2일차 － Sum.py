for tc in range(10):
    t = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]
    max_sum = 0
    for i in range(100):
        sum1 = sum2 = 0
        for j in range(100):
            sum1 += arr[i][j]
            sum2 += arr[j][i]
        if sum1 > max_sum:
            max_sum = sum1
        if sum2 > max_sum:
            max_sum = sum2
    sum1 = sum2 = 0
    for i in range(100):
        sum1 += arr[i][i]
        sum2 += arr[i][99 - i]
    if sum1 > max_sum:
        max_sum = sum1
    if sum2 > max_sum:
        max_sum = sum2
    print(f'#{tc + 1} {max_sum}')