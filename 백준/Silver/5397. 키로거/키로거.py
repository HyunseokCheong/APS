from collections import deque

n = int(input())
for _ in range(n):
    s = list(input())
    lStack = deque()
    rStack = deque()
    for i in range(len(s)):
        if s[i] == '<':
            if len(lStack) > 0:
                rStack.appendleft(lStack.pop())
        elif s[i] == '>':
            if len(rStack) > 0:
                lStack.append(rStack.popleft())
        elif s[i] == '-':
            if len(lStack) > 0:
                lStack.pop()
        else:
            lStack.append(s[i])
    print(''.join(lStack + rStack))