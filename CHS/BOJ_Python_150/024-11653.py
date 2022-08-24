import sys

input = sys.stdin.readline

N = int(input())
res = N
temp = 2
while res != 1:
    if res % temp == 0:
        res //= temp
        print(temp)
    else:
        temp += 1