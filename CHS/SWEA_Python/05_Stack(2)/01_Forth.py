import sys

sys.stdin = open('01_Forth.txt')
for tc in range(int(input())):
    nums = list(input().split())

    N = len(nums)
    stack = []
    answer = True

    for i in range(0, N - 1):
        if nums[i].isdigit():
            stack.append(nums[i])
        elif len(stack) >= 2:
            B = int(stack.pop())
            A = int(stack.pop())
            if nums[i] == '+':
                stack.append(A + B)
            elif nums[i] == '-':
                stack.append(A - B)
            elif nums[i] == '*':
                stack.append(A * B)
            elif nums[i] == '/':
                stack.append(A // B)
        else:
            answer = False
    if answer is False or len(stack) > 1:
        print(f'#{tc + 1} error')
    else:
        print(f'#{tc + 1} {stack.pop()}')