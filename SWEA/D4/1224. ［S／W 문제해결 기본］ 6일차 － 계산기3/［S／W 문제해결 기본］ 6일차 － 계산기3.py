for tc in range(10):
    n = int(input())
    s = input()
    stack = []
    temp = ''
    for i in range(n):
        if s[i].isdigit():
            temp += s[i]
        else:
            if s[i] == '(':
                stack.append(s[i])
            elif s[i] == '*':
                while stack and stack[-1] == '*':
                    temp += stack.pop()
                stack.append(s[i])
            elif s[i] == '+':
                while stack and stack[-1] != '(':
                    temp += stack.pop()
                stack.append(s[i])
            elif s[i] == ')':
                while stack and stack[-1] != '(':
                    temp += stack.pop()
                stack.pop()
    while stack:
        temp += stack.pop()
    for i in range(len(temp)):
        if temp[i].isdigit():
            stack.append(int(temp[i]))
        else:
            if temp[i] == '*':
                stack.append(stack.pop() * stack.pop())
            elif temp[i] == '+':
                stack.append(stack.pop() + stack.pop())
    print(f'#{tc + 1} {stack.pop()}')