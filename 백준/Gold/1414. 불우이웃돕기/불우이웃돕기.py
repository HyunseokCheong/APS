import heapq
import sys

input = sys.stdin.readline


def find(x: int) -> int:
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]


def union(x: int, y: int) -> None:
    x = find(x)
    y = find(y)

    if x > y:
        parent[x] = y
    elif x < y:
        parent[y] = x


def string_to_length(x: str) -> int:
    if ord('a') <= ord(x) <= ord('z'):
        return ord(x) - ord('a') + 1
    if ord('A') <= ord(x) <= ord('Z'):
        return ord(x) - ord('A') + 27
    if x == '0':
        return 0


if __name__ == "__main__":
    n = int(input())
    data = [list(input()) for _ in range(n)]

    total_length = 0
    hq = []
    for i in range(n):
        for j in range(n):
            length = string_to_length(data[i][j])
            total_length += length
            heapq.heappush(hq, (length, i + 1, j + 1))

    parent = [i for i in range(n + 1)]

    while hq:
        length, a, b = heapq.heappop(hq)
        if length == 0:
            continue

        if find(a) != find(b):
            union(a, b)
            total_length -= length

    for i in range(1, n + 1):
        if find(i) != 1:
            print(-1)
            break
    else:
        print(total_length)