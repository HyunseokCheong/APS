import sys

input = sys.stdin.readline

K, N, M = map(int, input().split())
answer = M - (K * N)
if answer < 0:
    print(abs(answer))
else:
    print(0)