import sys

input = sys.stdin.readline


def bhh(x):
    for i in range(1, x + 1):
        tmp = i
        for j in str(i):
            tmp += int(j)
        if tmp == x:
            return i
    return 0


n = int(input())
ans = bhh(n)
print(ans)
