import sys
sys.stdin = open('04_min max.txt')
for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))

    max_val = 0
    min_val = 1000000

    for i in range(0, N):
        if nums[i] > max_val:
            max_val = nums[i]
        if nums[i] < min_val:
            min_val = nums[i]

    answer = max_val - min_val
    print(f'#{tc + 1} {answer}')