import sys

sys.stdin = open('01_이웃원소의합.txt')
for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))

    temp = []
    for i in range(0, N - 1):
        temp.append(nums[i] + nums[i + 1])

    max_val = 0
    for i in temp:
        if i > max_val:
            max_val = i

    print(f'#{tc + 1} {max_val}')