import sys

input = sys.stdin.readline
n = int(input())
for i in range(2 * n - 1):
    if i < n:
        print('*' * (i + 1) + ' ' * (2 * n - 2 * (i + 1)) + '*' * (i + 1))
    else:
        print('*' * (2 * n - i - 1) + ' ' * (2 * (i + 1 - n)) + '*' * (2 * n - i - 1))
