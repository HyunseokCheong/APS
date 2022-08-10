# x와 y좌표가 주어졌다 => 완전탐색 범위
board = [[0] * 100 for _ in range(100)]

# board에서 사각형 범위를 표시
for _ in range(4):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(y1, y2):
        for j in range(x1, x2):
            board[i][j] = 1
res = 0
for i in board:
    res += i.count(1)
print(res)