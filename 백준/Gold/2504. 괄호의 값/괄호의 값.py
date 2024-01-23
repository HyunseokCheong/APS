s = input()
stack = []

result = 0
count = 1
for i in range(len(s)):
    c = s[i]
    if c == '(':
        stack.append(c)
        count *= 2
    elif c == '[':
        stack.append(c)
        count *= 3
    elif c == ')':
        if not stack or stack[-1] != '(':
            result = 0
            break
        if s[i - 1] == '(':
            result += count
        stack.pop()
        count //= 2
    elif c == ']':
        if not stack or stack[-1] != '[':
            result = 0
            break
        if s[i - 1] == '[':
            result += count
        stack.pop()
        count //= 3
    else:
        result = 0
        break
if stack:
    result = 0
print(result)