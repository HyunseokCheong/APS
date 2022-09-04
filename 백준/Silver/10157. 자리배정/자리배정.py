# Col, Row
C, R = map(int, input().split())
# 대기 번호
K = int(input())

# 예외: 좌석 수보다 대기 번호가 큰 경우
if K > C * R:
    print(0)
    exit()

# 상 우 하 좌
dc = [0, 1, 0, -1]
dr = [-1, 0, 1, 0]

# 좌석, 진행 방향, 위치 초기화
seats = [[0] * C for _ in range(R)]
direction = 0
row = R - 1
col = 0

for seat in range(1, C * R + 1):
    # 도착
    if seat == K:
        print(col + 1, R - row)
        break
    else:
        seats[row][col] = seat

        row += dr[direction]
        col += dc[direction]

        if row < 0 or col < 0 or row >= R or col >= C or seats[row][col]:
            row -= dr[direction]
            col -= dc[direction]

            direction = (direction + 1) % 4
            row += dr[direction]
            col += dc[direction]