def binary(i, b, s, e):
    while s <= e:
        mid = (s + e) // 2

        if i == b[mid]:
            return 1

        elif i > b[mid]:
            s = mid + 1

        else:
            e = mid - 1

    return 0


import sys

a = int(input())
b = sorted(map(int, sys.stdin.readline().split(" ")))
c = int(input())
d = list(map(int, sys.stdin.readline().split(" ")))

res = ''
for i in d:
    print(binary(i, b, 0, len(b) - 1), end=' ')