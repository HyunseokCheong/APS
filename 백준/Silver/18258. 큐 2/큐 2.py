import sys
from collections import deque

input = sys.stdin.readline

if __name__ == "__main__":
    n = int(input())
    queue = deque()
    for _ in range(n):
        cmd = list(input().split())
        if cmd[0] == "push":
            queue.append(int(cmd[1]))
        elif cmd[0] == 'pop':
            print(-1 if not queue else queue.popleft())
        elif cmd[0] == "size":
            print(len(queue))
        elif cmd[0] == "empty":
            print(1 if not queue else 0)
        elif cmd[0] == "front":
            print(-1 if not queue else queue[0])
        elif cmd[0] == "back":
            print(-1 if not queue else queue[-1])