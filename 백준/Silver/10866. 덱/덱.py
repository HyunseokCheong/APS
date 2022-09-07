import sys
from collections import deque

N = int(sys.stdin.readline())

arr = deque()

for i in range(N):
    cmd = list(sys.stdin.readline().split())

    if cmd[0] == 'push_front':
        arr.appendleft(cmd[1])

    if cmd[0] == 'push_back':
        arr.append(cmd[1])

    if cmd[0] == 'pop_front':
        if len(arr) == 0:
            print(-1)
        else:
            print(arr.popleft())

    if cmd[0] == 'pop_back':
        if len(arr) == 0:
            print(-1)
        else:
            print(arr.pop())

    if cmd[0] == 'size':
        print(len(arr))

    if cmd[0] == 'empty':
        if len(arr) == 0:
            print(1)
        else:
            print(0)

    if cmd[0] == 'front':
        if len(arr) == 0:
            print(-1)
        else:
            print(arr[0])

    if cmd[0] == 'back':
        if len(arr) == 0:
            print(-1)
        else:
            print(arr[-1])