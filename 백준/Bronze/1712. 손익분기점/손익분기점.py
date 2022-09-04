import sys

input = sys.stdin.readline

A, B, C = map(int, input().split())

if B >= C:
    answer = -1
else:
    answer = A // (C - B) + 1

print(answer)