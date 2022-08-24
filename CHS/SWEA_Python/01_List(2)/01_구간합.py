import sys

sys.stdin = open('01_구간합.txt')
for tc in range(int(input())):
    N, M = map(int, input().split())
    nums = list(map(int, input().split()))

    max_val = 0
    min_val = 0

    for i in range(0, N - M + 1):
        temp = 0

        for j in range(i, i + M):
            temp += nums[j]

        if temp > max_val:
            max_val = temp

        if temp < min_val or min_val == 0:
            min_val = temp

    answer = max_val - min_val

    print(f'#{tc + 1} {answer}')