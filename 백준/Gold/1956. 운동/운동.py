import sys

input = sys.stdin.readline
INF = sys.maxsize

if __name__ == "__main__":
    v, e = map(int, input().split())

    graph = [[INF] * (v + 1) for _ in range(v + 1)]
    for _ in range(e):
        a, b, c = map(int, input().split())
        graph[a][b] = c

    for i in range(1, v + 1):
        for j in range(1, v + 1):
            for k in range(1, v + 1):
                graph[j][k] = min(graph[j][k], graph[j][i] + graph[i][k])

    answer = INF
    for i in range(1, v + 1):
        answer = min(answer, graph[i][i])

    print(answer if answer != INF else -1)