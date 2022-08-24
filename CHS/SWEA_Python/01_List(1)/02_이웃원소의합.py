import sys

sys.stdin = open('02_이웃원소의합.txt')

for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))
    temp = []

    for i in range(1, N):
        temp.append(nums[i] + nums[i - 1])

    max_val = 0
    for i in temp:
        if i > max_val:
            max_val = i

    print(f'#{tc + 1} {max_val}')
