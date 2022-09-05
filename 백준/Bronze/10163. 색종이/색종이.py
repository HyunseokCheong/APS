board = [[0] * 1001 for _ in range(1001)]
N = int(input())
for i in range(1, N + 1):
    x1, y1, width, height = map(int, input().split())
    for j in range(x1, x1 + width):
        for k in range(y1, y1 + height):
            board[j][k] = i

for i in range(1, N + 1):
    result = 0
    for j in range(0, len(board)):
        result += board[j].count(i)
    print(result)