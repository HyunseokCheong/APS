import sys

input = sys.stdin.readline

def binary_search(s, e, t):
    while s <= e:
        m = (s + e) // 2
        if points[m] == t:
            return 1
        if points[m] > t:
            e = m - 1
        else:
            s = m + 1
    return 0

T = int(input())
for i in range(T):
    cnt = 0
    N = int(input())
    points = sorted(list(map(int, input().split())))
    s = 0
    e = N - 1
    for j in range(N - 1):
        for k in range(j + 1, N):
            distance = abs(points[k] - points[j])
            if binary_search(s, e, points[k] + distance):
                cnt += 1
    print(cnt)