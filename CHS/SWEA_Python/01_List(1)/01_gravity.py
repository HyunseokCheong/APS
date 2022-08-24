import sys

sys.stdin = open('01_gravity.txt')
for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))
    max_fall = 0
    for i in range(0, N - 1):
        fall = N - 1 - i
        for j in range(i + 1, N):
            if nums[i] <= nums[j]:
                fall -= 1
        if fall > max_fall:
            max_fall = fall
    print(f'#{tc + 1} {max_fall}')
