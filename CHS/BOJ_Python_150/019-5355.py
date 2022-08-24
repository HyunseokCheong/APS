import sys

input = sys.stdin.readline

T = int(input())
for i in range(T):
    marsmath = list(input().split())
    res = float(marsmath[0])
    for j in marsmath[1:]:
        if j == '@':
            res *= 3
        elif j == '%':
            res += 5
        elif j == '#':
            res -= 7
    print(f'{res:.2f}')