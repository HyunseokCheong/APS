stack = []
s = input()

count = 0
for i in range(len(s)):
    c = s[i]
    if c == '(':
        stack.append(c)
    elif c == ')' and s[i - 1] == '(':
        stack.pop()
        count += len(stack)
    elif c == ')':
        stack.pop()
        count += 1
print(count)