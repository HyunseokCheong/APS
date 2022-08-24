import sys

input = sys.stdin.readline

T = int(input())
for i in range(T):
    A, B = input().split()
    A = int(A)
    for j in B:
        print(j * A, end='')
    print()