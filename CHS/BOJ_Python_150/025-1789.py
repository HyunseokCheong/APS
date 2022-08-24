import sys

input = sys.stdin.readline

S = int(input())
N = 1
while N * (N + 1) / 2 <= S:
    N += 1
print(N - 1)

# N * (N + 1) / 2 => 1부터 N까지의 합의 공식