N, M = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(N)]
K = int(input())

for idx in range(K):
    ans = 0
    i, j, x, y = map(int, input().split())
    for row in range(i - 1, x):
        for col in range(j - 1, y):
            ans += board[row][col]
    print(ans)