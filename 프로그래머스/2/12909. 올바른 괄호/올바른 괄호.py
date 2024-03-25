def solution(s):
    stack = []
    for data in s:
        if data == '(':
            stack.append('(')
        else:
            if len(stack) == 0 or stack[-1] != '(':
                return False
            else:
                stack.pop()
    if len(stack) != 0:
        return False
    return True
