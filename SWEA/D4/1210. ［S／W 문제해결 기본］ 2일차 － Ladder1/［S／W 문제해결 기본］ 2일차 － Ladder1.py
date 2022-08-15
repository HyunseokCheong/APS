# 진로 설정: 상, 우 좌
dr = [-1, 0, 0]
dc = [0, 1, -1]

# input
for tc in range(10):
    T = int(input())
    # 벽 + 사다리 + 벽 생성
    ladder = [[0] + list(map(int, input().split())) + [0] for _ in range(100)]

    # implement
    # 초기 위치, 진로 설정
    column = 0
    for j in range(0, 102):
        if ladder[99][j] == 2:
            column = j
    row = 99
    direction = 0

    # 출발
    while row != 0:
        if ladder[row][column -1] == 1:
            direction = 2
            while True:
                column += dc[direction]
                if ladder[row][column - 1] == 0:
                    break
        elif ladder[row][column + 1] == 1:
            direction = 1
            while True:
                column += dc[direction]
                if ladder[row][column + 1] == 0:
                    break
        direction = 0
        row += dr[direction]
    print(f'#{tc + 1} {column - 1}')