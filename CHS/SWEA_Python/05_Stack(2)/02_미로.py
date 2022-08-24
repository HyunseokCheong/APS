import sys

sys.stdin = open('02_미로.txt')
'''
0 통로
1 벽
2 출발
3 도착

도착할 수 있으면 1
아니면 0
'''
def DFS(row, col):
    global res
    maze[row][col] = 1
    for direction in range(4):
        forward_row = dr[direction] + row
        forward_col = dc[direction] + col
        if 0 <= forward_row < N and 0 <= forward_col < N:
            if maze[forward_row][forward_col] == 3:
                res = 1
                return
            elif maze[forward_row][forward_col] == 0:
                DFS(forward_row, forward_col)


# 상 하 좌 우
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]
for tc in range(int(input())):
    N = int(input())
    maze = [list(map(int, input())) for _ in range(N)]

    for r in range(N):
        for c in range(N):
            if maze[r][c] == 2:
                row = r
                col = c

    res = 0
    DFS(row, col)

    print(f'#{tc + 1} {res}')
