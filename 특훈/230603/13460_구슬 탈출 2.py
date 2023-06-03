from collections import deque

n, m = map(int, input().split())
board = [list(input()) for _ in range(n)]

dr = [1, -1, 0, 0]
dc = [0, 0, -1, 1]
q = deque()
visited = [[[[False] * m for _ in range(n)] for _ in range(m)] for _ in range(n)]


def init():
    rr, rc, br, bc = 0, 0, 0, 0
    for r in range(n):
        for c in range(m):
            cur = board[r][c]
            if cur == 'R':
                rr, rc = r, c
            elif cur == 'B':
                br, bc = r, c
    visited[rr][rc][br][bc] = True
    q.append((rr, rc, br, bc, 1))


def move(r, c, nr, nc):
    count = 0
    while board[r + nr][c + nc] != '#' and board[r][c] != 'O':
        r += nr
        c += nc
        count += 1
    return r, c, count


def solve():
    while q:
        rr, rc, br, bc, depth = q.popleft()
        if depth > 10:
            break
        for i in range(4):
            nrr, nrc, rct = move(rr, rc, dr[i], dc[i])
            nbr, nbc, bct = move(br, bc, dr[i], dc[i])
            if board[nbr][nbc] != 'O':
                if board[nrr][nrc] == 'O':
                    print(depth)
                    return
                if nrr == nbr and nrc == nbc:
                    if rct > bct:
                        nrr -= dr[i]
                        nrc -= dc[i]
                    else:
                        nbr -= dr[i]
                        nbc -= dc[i]
                if not visited[nrr][nrc][nbr][nbc]:
                    visited[nrr][nrc][nbr][nbc] = True
                    q.append((nrr, nrc, nbr, nbc, depth + 1))
    print(-1)


init()
solve()
