import sys

input = sys.stdin.readline
K, N = map(int, input().split())

arr = [0] * K
for i in range(K):
    arr[i] = int(input())

S, E = 1, max(arr)
while S <= E:
    M = (S + E) // 2
    C = 0

    for i in range(K):
        C += arr[i] // M
    if C >= N:
        S = M + 1
    else:
        E = M - 1

print(E)
