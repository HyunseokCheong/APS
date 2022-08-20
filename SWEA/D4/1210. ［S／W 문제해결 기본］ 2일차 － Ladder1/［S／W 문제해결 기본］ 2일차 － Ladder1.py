# 방향 설정 상 우 좌
dr = [-1, 0, 0]
dc = [0, 1, -1]

for tc in range(10):
    T = int(input())
    ladder = [[0] + list(map(int, input().split())) + [0] for _ in range(100)]

    # 진로, 위치 설정
    direction = 0
    row = 99
    col = 0
    for i in range(1, 101):
        if ladder[row][i] == 2:
            col = i

    # 출발
    while row != 0:
        # 우
        if ladder[row][col + 1] == 1:
            direction = 1
            while True:
                col += dc[direction]
                if ladder[row][col + 1] == 0:
                    break
        # 좌
        elif ladder[row][col - 1] == 1:
            direction = 2
            while True:
                col += dc[direction]
                if ladder[row][col - 1] == 0:
                    break
        # 상
        direction = 0
        row += dr[direction]

    # 출력
    print(f'#{tc + 1} {col - 1}')