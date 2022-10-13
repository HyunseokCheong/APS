import sys

sys.stdin = open('2115.txt', 'r')

t = int(input())
for tc in range(t):
    n, m, c = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(n)]

    print(arr)
