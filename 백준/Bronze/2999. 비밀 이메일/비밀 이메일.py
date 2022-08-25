word = input()
N = len(word)

R = 1
for i in range(int(N ** 0.5), 0, -1):
    if N % i == 0:
        R = i
        break
C = N // R

board = [[0] * C for _ in range(R)]
i = 0
for col in range(C):
    for row in range(R):
        board[row][col] = word[i]
        i += 1

for row in range(R):
    for col in range(C):
        print(board[row][col], end='')