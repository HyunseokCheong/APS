import sys

input = sys.stdin.readline

N = int(input())
numbers_N = list(map(int, input().split()))
M = int(input())
numbers_M = list(map(int, input().split()))

new_dict = dict()

for i in numbers_N:
    try:
        new_dict[i] += 1
    except:
        new_dict[i] = 1

for i in numbers_M:
    try:
        print(new_dict[i], end=' ')
    except:
        print(0, end=' ')