import sys

input = sys.stdin.readline
n = int(input())
arr = [[0] * 2 for _ in range(n)]
for i in range(n):
    arr[i][0], arr[i][1] = map(int, input().split())
arr.sort(key=lambda x: (x[1], x[0]))
cnt = 0
end = 0
for i in range(n):
    if arr[i][0] >= end:
        cnt += 1
        end = arr[i][1]
print(cnt)
