import sys

sys.stdin = open('03_최대값과 최소값.txt')
for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))

    max_idx = 0
    min_idx = 0

    for i in range(0, N):
        if nums[i] > nums[max_idx] or (nums[i] == nums[max_idx] and i > max_idx):
            max_idx = i
        if nums[i] < nums[min_idx] or (nums[i] == nums[min_idx] and i < min_idx):
            min_idx = i
    answer = max_idx - min_idx
    if answer < 0:
        answer = -answer

    print(f'#{tc + 1} {answer}')