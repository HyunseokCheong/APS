from collections import deque
import sys

input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(input().rstrip()) for _ in range(n)]

dr = [1, -1, 0, 0]
dc = [0, 0, -1, 1]
q = deque()
vis = [[[[False] * m for _ in range(n)] for _ in range(m)] for _ in range(n)]


def init():
    rr, rc, br, bc = 0, 0, 0, 0
    for row in range(n):
        for col in range(m):
            if arr[row][col] == 'R':
                rr, rc = row, col
            elif arr[row][col] == 'B':
                br, bc = row, col
    q.append((rr, rc, br, bc, 1))
    vis[rr][rc][br][bc] = True


def move(r, c, nr, nc):
    cnt = 0
    while arr[r + nr][c + nc] != '#' and arr[r][c] != 'O':
        r += nr
        c += nc
        cnt += 1
    return r, c, cnt


def solve():
    init()
    while q:
        rr, rc, br, bc, depth = q.popleft()
        if depth > 10:
            break
        for i in range(4):
            nrr, nrc, rcnt = move(rr, rc, dr[i], dc[i])
            nbr, nbc, bcnt = move(br, bc, dr[i], dc[i])
            if arr[nbr][nbc] != 'O':
                if arr[nrr][nrc] == 'O':
                    print(depth)
                    return
                if nrr == nbr and nrc == nbc:
                    if rcnt > bcnt:
                        nrr -= dr[i]
                        nrc -= dc[i]
                    else:
                        nbr -= dr[i]
                        nbc -= dc[i]
                if not vis[nrr][nrc][nbr][nbc]:
                    vis[nrr][nrc][nbr][nbc] = True
                    q.append((nrr, nrc, nbr, nbc, depth + 1))
    print(-1)


solve()
