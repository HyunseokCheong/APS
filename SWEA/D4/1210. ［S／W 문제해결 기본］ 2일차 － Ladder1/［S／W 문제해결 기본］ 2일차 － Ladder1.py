dr = [-1, 0, 0]
dc = [0, 1, -1]

# 입력
for _ in range(10):
    tc = int(input())
    ladder = [[0] + list(map(int, input().split())) + [0] for i in range(100)]
    # 초기 위치, 방향 설정
    row = 99
    column = 0
    for i in range(0, 102):
        if ladder[row][i] == 2:
            column = i
    direction = 0
    # 출발
    while True:
        # 도착
        if row == 0:
            break
        # 좌로 이동
        if ladder[row][column - 1] == 1:
            direction = 2
            while True:
                column += dc[direction]
                if ladder[row][column - 1] == 0:
                    break
        # 우로 이동
        elif ladder[row][column + 1] == 1:
            direction = 1
            while True:
                column += dc[direction]
                if ladder[row][column + 1] == 0:
                    break
        # 위로 이동
        direction = 0
        row += dr[direction]
        column += dc[direction]
    print(f'#{tc} {column - 1}')