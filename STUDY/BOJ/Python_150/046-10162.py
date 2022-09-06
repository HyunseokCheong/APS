import sys

input = sys.stdin.readline

T = int(input())
if T % 10 != 0:
    print(-1)
else:
    print(T // 300, (T % 300) // 60, ((T % 300) % 60) // 10)