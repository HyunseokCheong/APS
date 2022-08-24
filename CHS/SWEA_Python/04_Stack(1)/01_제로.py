import sys

sys.stdin = open('01_제로.txt')
for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))

    stack = []

    for i in range(0, N):
        if nums[i] != 0:
            stack.append(nums[i])
        else:
            stack.pop()

    res = 0
    for i in stack:
        res += i

    print(f'#{tc + 1} {res}')
