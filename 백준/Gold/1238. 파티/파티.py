import heapq
import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    1 <= n <= 1,000
    1 <= m <= 10,000
    1 <= x <= n
    1 <= a, b <= n
    1 <= t <= 100
    """
    n, m, x = map(int, input().split())
    graph = [[] for _ in range(n + 1)]
    for i in range(m):
        a, b, t = map(int, input().split())
        graph[a].append([b, t])

    dist = [sys.maxsize] * (n + 1)
    hq = []

    # to x
    dist_to_x = [sys.maxsize] * (n + 1)
    for i in range(1, n + 1):
        dist = [sys.maxsize] * (n + 1)

        heapq.heappush(hq, [0, i])
        dist[i] = 0

        while hq:
            cost, node = heapq.heappop(hq)
            if cost > dist[node]:
                continue
            for next_node, next_cost in graph[node]:
                if dist[next_node] > cost + next_cost:
                    dist[next_node] = cost + next_cost
                    heapq.heappush(hq, [cost + next_cost, next_node])
        dist_to_x[i] = dist[x]

    # from x
    dist_from_x = [sys.maxsize] * (n + 1)

    heapq.heappush(hq, [0, x])
    dist_from_x[x] = 0
    while hq:
        cost, node = heapq.heappop(hq)
        if cost > dist_from_x[node]:
            continue
        for next_node, next_cost in graph[node]:
            if dist_from_x[next_node] > cost + next_cost:
                dist_from_x[next_node] = cost + next_cost
                heapq.heappush(hq, [cost + next_cost, next_node])

    max_dist = 0
    for i in range(1, n + 1):
        max_dist = max(max_dist, dist_to_x[i] + dist_from_x[i])
    print(max_dist)