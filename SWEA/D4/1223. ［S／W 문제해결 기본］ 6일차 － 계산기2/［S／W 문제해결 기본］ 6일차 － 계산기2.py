for tc in range(10):
    N = int(input())
    stack = list(input())

    idx = 0

    while idx < len(stack) - 2:
        if stack[idx].isdigit():
            if stack[idx + 1] == '*':
                stack[idx] = str(int(stack[idx]) * int(stack[idx + 2]))
                stack.pop(idx + 1)
                stack.pop(idx + 1)
                continue
        idx += 1

    res = 0
    for i in stack:
        if i.isdigit():
            res += int(i)
    print(f'#{tc + 1} {res}')