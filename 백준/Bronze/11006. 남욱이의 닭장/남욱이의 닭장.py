import sys

input = sys.stdin.readline

T = int(input())
for i in range(T):
    N, M = map(int, input().split())
    U = M * 2 - N
    T = M - U
    print(U, T)