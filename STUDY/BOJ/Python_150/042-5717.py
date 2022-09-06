import sys

input = sys.stdin.readline

while True:
    A, B = map(int, input().split())
    if A == B == 0:
        break
    print(A + B)