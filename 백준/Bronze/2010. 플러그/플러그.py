import sys

N = int(sys.stdin.readline())
plug = 0
for i in range(N):
    P = int(sys.stdin.readline())
    plug += P
answer = plug - N + 1
print(answer)