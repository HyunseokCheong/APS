'''
흑 1
백 2
'''
# 입력
for tc in range(int(input())):
    # 보드 크기 N X N, 게임 라운드 M
    N, M = map(int, input().split())
    board = [[0] * N for _ in range(N)]

    # 중앙 표시
    mid = N // 2
    board[mid][mid] = 2
    board[mid - 1][mid - 1] = 2
    board[mid - 1][mid] = 1
    board[mid][mid - 1] = 1

    # 델타
    # 상 하 좌 우 우상 우하 좌상 좌하
    dr = [1, -1, 0, 0, 1, -1, 1, -1]
    dc = [0, 0, -1, 1, 1, 1, -1, -1]

    # 게임 시작
    for i in range(M):
        # 열, 행, 돌
        C, R, D = map(int, input().split())
        C, R = C - 1, R - 1
        board[R][C] = D

        # 타겟 돌을 저장할 리스트
        target = []

        # 8 방향 탐색
        for j in range(8):
            nr, nc = R + dr[j], C + dc[j]
            while True:
                # 모서리를 만났을 때, 리스트 초기화, 반복 종료
                if nr < 0 or nc < 0 or nr > N - 1 or nc > N - 1:
                    target = []
                    break

                # 빈 칸을 만났을 때, 리스트 초기화, 반복 종료
                elif board[nr][nc] == 0:
                    target = []
                    break

                # 같은 색 돌을 만났을 때, 반복 종료
                elif board[nr][nc] == D:
                    break

                # 다른 색 돌을 만났을 때, 리스트에 해당 좌표 추가
                else:
                    target.append((nr, nc))

                # 진행 방향 + 1
                nr, nc = nr + dr[j], nc + dc[j]

            # 타겟 리스트에 저장한 좌표 뒤집기
            for k in target:
                board[k[0]][k[1]] = D

    # 게임 끝, 점수 계산
    B = W = 0
    for row in range(N):
        for col in range(N):
            if board[row][col] == 1:
                B += 1
            elif board[row][col] == 2:
                W += 1
    print(f'#{tc + 1} {B} {W}')