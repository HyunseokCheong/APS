import sys
from collections import deque

input = sys.stdin.readline

if __name__ == "__main__":
    deque = deque()
    n = int(input())
    for _ in range(n):
        cmd = list(input().split())
        if cmd[0] == 'push_front':
            deque.appendleft(cmd[1])
        elif cmd[0] == 'push_back':
            deque.append(cmd[1])
        elif cmd[0] == 'pop_front':
            print(-1 if not deque else deque.popleft())
        elif cmd[0] == 'pop_back':
            print(-1 if not deque else deque.pop())
        elif cmd[0] == 'size':
            print(len(deque))
        elif cmd[0] == 'empty':
            print(1 if not deque else 0)
        elif cmd[0] == 'front':
            print(-1 if not deque else deque[0])
        elif cmd[0] == 'back':
            print(-1 if not deque else deque[-1])