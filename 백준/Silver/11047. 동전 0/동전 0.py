import sys

input = sys.stdin.readline

n, k = map(int, input().split())
arr = [0] * n
for i in range(n):
    arr[i] = int(input())
arr.sort(reverse=True)

cnt = 0
for i in range(n):
    cnt += k // arr[i]
    k = k % arr[i]
print(cnt)
