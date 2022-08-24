import sys

input = sys.stdin.readline

M = int(input())
N = int(input())
WJS = []
for i in range(M, N + 1):
    if (i ** 0.5) % 1 == 0:
        WJS.append(i)
if len(WJS) == 0:
    print(-1)
else:
    print(sum(WJS))
    print(min(WJS))