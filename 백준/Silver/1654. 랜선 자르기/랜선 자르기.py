import sys
input = sys.stdin.readline

K, N = map(int, input().split())
arr = []

for i in range(K):
    arr.append(int(input()))

start = 1
end = max(arr)

while (start <= end):
    mid = (start + end) // 2
    cnt = 0
    for i in range(K):
        cnt += arr[i] // mid
    if cnt >= N:
        start = mid + 1
    else:
        end = mid - 1
print(end)
