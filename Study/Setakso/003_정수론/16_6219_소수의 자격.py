import sys
import math

A, B, D = map(int, sys.stdin.readline().split())


def prime(x):
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True


cnt = 0
for i in range(A, B + 1):
    if str(D) in list(str(i)):
        if prime(i) == True:
            cnt += 1
print(cnt)
