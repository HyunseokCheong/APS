'''
조건이 만족하는 경우 계속 반복할 수 있도록 스택을 사용
'''
# 델타 상하좌우
dr = [1, -1, 0, 0]
dc = [0, 0, -1, 1]


def counting(r, c):
    global N
    move_cnt = 0
    arr = [(r, c)]
    while arr:
        pre_r, pre_c = arr.pop()
        move_cnt += 1

        # 4방향 탐색
        for i in range(4):
            new_r, new_c = pre_r + dr[i], pre_c + dc[i]

            # 범위안에 있는지 검사, +1 조건 맞는지 검사
            if 0 <= new_r < N and 0 <= new_c < N and board[pre_r][pre_c] + 1 == board[new_r][new_c]:
                arr.append((new_r, new_c))
    return move_cnt


# 입력
for tc in range(int(input())):
    N = int(input())
    board = [list(map(int, input().split())) for _ in range(N)]

    # 최대 이동거리, 출발점
    max_move = 0
    max_start = 1000000

    # 전체 탐색
    for row in range(N):
        for col in range(N):
            # 해당 출발점의 이동거리 계산
            move = counting(row, col)

            # 이동거리 및 출발점이 최대 조건에 맞는지 검사
            if move > max_move:
                max_move = move
                max_start = board[row][col]
            elif move == max_move:
                if board[row][col] < max_start:
                    max_start = board[row][col]

    # 출력
    print(f'#{tc + 1} {max_start} {max_move}')