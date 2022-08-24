import sys

input = sys.stdin.readline

A, B, C = map(int, input().split())
D = int(input())
S = (C + D) % 60
M = (B + (C + D) // 60) % 60
H = (A + ((C + D) // 60 + B) // 60) % 24
print(H, M, S)