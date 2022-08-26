import sys

sys.stdin = open('03_폭격 작전.txt')
for tc in range(int(input())):
    N, M = map(int, input().split())  # 지도 크기, 폭탄 개수
    board = [list(map(int, input().split())) for _ in range(N)]

    cnt = 0
    for _ in range(M):
        bomb_row, bomb_col, bomb_power = map(int, input().split())
        for i in range(-bomb_power, bomb_power + 1):
            for j in range(-bomb_power, bomb_power + 1):
                if 0 <= bomb_row + i < N and 0 <= bomb_col + j < N:
                    cnt += board[bomb_row + i][bomb_col]
                    board[bomb_row + i][bomb_col] = 0
                    cnt += board[bomb_row][bomb_col + j]
                    board[bomb_row][bomb_col + j] = 0
    print(f'#{tc + 1} {cnt}')