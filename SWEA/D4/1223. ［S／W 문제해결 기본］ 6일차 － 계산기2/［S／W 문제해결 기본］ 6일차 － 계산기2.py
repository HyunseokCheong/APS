for tc in range(10):
    n = int(input())
    stack = list(input())
    idx = 0
    while idx < len(stack) - 2:
        if stack[idx].isdigit() and stack[idx + 1] == '*':
            stack[idx] = str(int(stack[idx]) * int(stack[idx + 2]))
            stack.pop(idx + 1)
            stack.pop(idx + 1)
            continue
        idx += 1
    ans = 0
    for i in range(len(stack)):
        if stack[i].isdigit():
            ans += int(stack[i])
    print(f'#{tc + 1} {ans}')
