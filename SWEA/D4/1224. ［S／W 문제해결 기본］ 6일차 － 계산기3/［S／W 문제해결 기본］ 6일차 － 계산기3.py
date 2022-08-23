for tc in range(10):
    N = int(input())
    nums = input()

    stack = []
    result = ''

    for i in nums:
        if i.isdigit():
            result += i
        else:
            if i == '(':
                stack.append(i)
            elif i == '*':
                while stack and stack[-1] == '*':
                    result += stack.pop()
                stack.append(i)
            elif i == '+':
                while stack and stack[-1] != '(':
                    result += stack.pop()
                stack.append(i)
            elif i == ')':
                while stack and stack[-1] != '(':
                    result += stack.pop()
                stack.pop()
    while stack:
        result += stack.pop()

    for i in result:
        if i == '+':
            stack.append(stack.pop() + stack.pop())
        elif i == '*':
            stack.append(stack.pop() * stack.pop())
        else:
            stack.append(int(i))

    print(f'#{tc + 1} {stack.pop()}')