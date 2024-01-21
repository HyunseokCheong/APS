import heapq

DIR = [[-1, 0], [1, 0], [0, -1], [0, 1]]

t = 1
while True:
    n = int(input())
    if n == 0:
        break
    board = [list(map(int, input().split())) for _ in range(n)]

    hq = []
    dist = [[float('inf')] * n for _ in range(n)]

    heapq.heappush(hq, [board[0][0], 0, 0])
    dist[0][0] = dist[0][0]

    while hq:
        cnt, row, col = heapq.heappop(hq)

        for dr, dc in DIR:

            next_row = row + dr
            next_col = col + dc

            if next_row < 0 or next_row == n or next_col < 0 or next_col == n:
                continue

            next_cnt = cnt + board[next_row][next_col]
            
            if dist[next_row][next_col] <= next_cnt:
                continue

            heapq.heappush(hq, [next_cnt, next_row, next_col])
            dist[next_row][next_col] = next_cnt

    print(f'Problem {t}: {dist[n - 1][n - 1]}')
    t += 1