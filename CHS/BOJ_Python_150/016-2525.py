import sys

input = sys.stdin.readline

A, B = map(int, input().split())
C = int(input())
M = (B + C) % 60
H = ((B + C) // 60 + A) % 24
print(H, M)