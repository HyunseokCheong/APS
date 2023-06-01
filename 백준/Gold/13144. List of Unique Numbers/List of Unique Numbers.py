import sys

input = sys.stdin.readline
n = int(input())
arr = list(map(int, input().split()))

res = 0
s, e, = 0, 0
visited = [False] * 100001

while s != n and e != n:
    if not visited[arr[e]]:
        visited[arr[e]] = True
        e += 1
        res += e - s
    else:
        while visited[arr[e]]:
            visited[arr[s]] = False
            s += 1

print(res)
