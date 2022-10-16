import sys

input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))

# 누적합 미리 구하기
prefix = [0 for _ in range(n + 1)]
for i in range(1, n + 1):
    prefix[i] = prefix[i - 1] + arr[i - 1]

for _ in range(m):
    s, e = map(int, input().split())
    print(prefix[e] - prefix[s - 1])
