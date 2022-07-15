import sys


def SOD(n):
    res = 0
    for i in range(2, n // 2 + 1):
        if n % i == 0:
            res += i
    return res


n = int(sys.stdin.readline())
res = 0
for i in range(1, n + 1):
    res += SOD(i)
print(res % 1000000)
