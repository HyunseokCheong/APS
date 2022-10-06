import sys

input = sys.stdin.readline
n = int(input())
for i in range(n):
    a, b = input().split()

    a = ''.join(sorted(a))
    b = ''.join(sorted(b))

    if len(a) != len(b):
        print('Impossible')
        continue

    for j in range(len(a)):
        if a[j] != b[j]:
            print('Impossible')
            break
    else:
        print('Possible')
