import sys

input = sys.stdin.readline


def pos(now):
    for i in range(1, n):
        if abs(now[i] - now[i - 1]) > 1:
            return False
        if now[i] < now[i - 1]:
            for j in range(l):
                if i + j >= n or used[i + j] or now[i] != now[i + j]:
                    return False
                if now[i] == now[i + j]:
                    used[i + j] = True
        elif now[i] > now[i - 1]:
            for j in range(l):
                if i - j - 1 < 0 or now[i - 1] != now[i - j - 1] or used[i - j - 1]:
                    return False
                if now[i - 1] == now[i - j - 1]:
                    used[i - j - 1] = True
    return True


n, l = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
res = 0

for i in range(n):
    used = [False for _ in range(n)]
    if pos(arr[i]):
        res += 1
for i in range(n):
    used = [False for _ in range(n)]
    if pos([arr[j][i] for j in range(n)]):
        res += 1
print(res)
