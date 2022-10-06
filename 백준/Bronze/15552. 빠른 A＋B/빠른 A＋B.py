import sys

input = sys.stdin.readline
t = int(input())
for tc in range(t):
    print(sum(map(int, input().split())))
