import sys

input = sys.stdin.readline

n, m = map(int, input().split())

limit = [0] * 101
speed = [0] * 101

h = 0
for i in range(n):
    l, s = map(int, input().split())
    for j in range(h + 1, h + l + 1):
        limit[j] = s
    h += l

h = 0
for i in range(m):
    l, s = map(int, input().split())
    for j in range(h + 1, h + l + 1):
        speed[j] = s
    h += l

max_number = 0
for i in range(101):
    max_number = max(max_number, speed[i] - limit[i])
print(max_number)
