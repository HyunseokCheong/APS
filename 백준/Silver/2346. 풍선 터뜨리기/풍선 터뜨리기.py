import sys
from collections import deque

input = sys.stdin.readline

if __name__ == "__main__":
    n = int(input())
    arr = list(map(int, input().split()))
    
    deque = deque([idx + 1, num] for idx, num in enumerate(arr))
    while len(deque) > 1:
        idx, num = deque.popleft()
        print(idx, end=" ")
        if num > 0:
            for _ in range(1, num, 1):
                deque.append(deque.popleft())
        else:
            for _ in range(num, 0, 1):
                deque.appendleft(deque.pop())
    print(deque.popleft()[0])