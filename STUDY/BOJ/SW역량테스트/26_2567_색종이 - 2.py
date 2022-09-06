N = int(input())
board = [[0 for _ in range(101)] for _ in range(101)]

for i in range(N):
    X, Y = map(int, input().split())
    for row in range(Y, Y + 10):
        for col in range(X, X + 10):
            board[row][col] = 1

# 상 하 좌 우
dc = [0, 0, -1, 1]
dr = [-1, 1, 0, 0]

result = 0
for i in range(1, 101):
    for j in range(1, 101):
        if board[i][j] == 1:
            cnt = 0
            for k in range(4):
                if board[i + dr[k]][j + dc[k]] == 1:
                    cnt += 1
            if cnt == 3:
                result += 1
            elif cnt == 2:
                result += 2

print(result)