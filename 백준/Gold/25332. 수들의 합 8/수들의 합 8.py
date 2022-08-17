import sys

input = sys.stdin.readline

# input
N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

# prefix
prefix = [0] * (N + 1)
for i in range(1, N + 1):
    prefix[i] = prefix[i - 1] + A[i - 1] - B[i - 1]

temp = {}
cnt = 0
for i in prefix:
    cnt += temp.get(i, 0)
    temp[i] = temp.get(i, 0) + 1
print(cnt)