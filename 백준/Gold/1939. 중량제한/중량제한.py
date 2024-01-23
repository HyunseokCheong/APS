import sys
from collections import deque

input = sys.stdin.readline


def arrived(cur_cost: int) -> bool:
    queue = deque()
    visited = [False for _ in range(n + 1)]

    queue.append(start)
    visited[start] = True
    while queue:
        node = queue.popleft()
        if node == end:
            return True
        for next_node, next_cost in graph[node]:
            if visited[next_node]:
                continue
            if next_cost < cur_cost:
                continue
            queue.append(next_node)
            visited[next_node] = True

    return False


if __name__ == "__main__":
    """
    2 <= n <= 10,000
    1 <= m <= 100,000
    1 <= a, b <= n
    1 <= c <= 1,000,000,000
    """
    n, m = map(int, input().split())
    graph = [[] for _ in range(n + 1)]
    for _ in range(m):
        a, b, c = map(int, input().split())
        graph[a].append([b, c])
        graph[b].append([a, c])
    for i in range(1, n + 1):
        graph[i].sort(reverse=True)
    start, end = map(int, input().split())

    left, right = 1, 1_000_000_000
    while left <= right:
        mid = (left + right) // 2
        if arrived(mid):
            left = mid + 1
        else:
            right = mid - 1
    print(right)