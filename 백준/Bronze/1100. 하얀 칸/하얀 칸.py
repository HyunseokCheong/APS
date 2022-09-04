cnt = 0
board = [list(input()) for _ in range(8)]

cnt = 0
for row in range(8):
    for col in range(8):
        if row % 2 == 0 and col % 2 == 0:
            if board[row][col] == 'F':
                cnt += 1
        if row % 2 != 0 and col % 2 != 0:
            if board[row][col] == 'F':
                cnt += 1

print(cnt)