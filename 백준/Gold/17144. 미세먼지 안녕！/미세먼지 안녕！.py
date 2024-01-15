from collections import deque


def find_dusts() -> None:
    """
    미세먼지가 있는 칸을 찾아서 [row, col, dust] 형태로 dusts에 추가 후 반환
    :return deque():
    """
    for i in range(r):
        for j in range(c):
            if room[i][j] > 0:
                dusts.append([i, j, room[i][j]])


def spread_dusts() -> None:
    """
    미세먼지를 확산시킨다.
    1. 미세먼지와 인접한 4방향에서 공기청정기가 있거나 방을 벗어나는 구역은 확산 X
    2. 확산되는 양 : room[r][c] // 5
    3. 남는 양 : room[r][c] - ((room[r][c] // 5) * 확산된 방향)
    :return:
    """
    global dusts, room

    direction = [[-1, 0], [1, 0], [0, -1], [0, 1]]

    while dusts:
        row, col, cnt = dusts.popleft()
        if cnt < 5:
            continue
        spread_amount = cnt // 5
        spread_direction = 0
        for d in range(4):
            next_row = row + direction[d][0]
            next_col = col + direction[d][1]
            if next_row < 0 or next_row >= r or next_col < 0 or next_col >= c:
                continue
            if room[next_row][next_col] == -1:
                continue
            room[next_row][next_col] += spread_amount
            spread_direction += 1
        room[row][col] -= spread_amount * spread_direction


def remove_dusts() -> None:
    """
    미세먼지를 제거한다.
    top : 공기청정기 윗칸
    bottom : 공기청정기 아랫칸
    공기청정기 1칸당 4구역의 이동
    :return:
    """
    global room

    # 공기청정기 윗부분 이동
    for i in range(top - 1, 0, -1):
        room[i][0] = room[i - 1][0]
    for i in range(c - 1):
        room[0][i] = room[0][i + 1]
    for i in range(top):
        room[i][c - 1] = room[i + 1][c - 1]
    for i in range(c - 1, 1, -1):
        room[top][i] = room[top][i - 1]
    room[top][1] = 0

    # 공기청정기 아랫부분 이동
    for i in range(bottom + 1, r - 1):
        room[i][0] = room[i + 1][0]
    for i in range(c - 1):
        room[r - 1][i] = room[r - 1][i + 1]
    for i in range(r - 1, bottom, -1):
        room[i][c - 1] = room[i - 1][c - 1]
    for i in range(c - 1, 1, -1):
        room[bottom][i] = room[bottom][i - 1]
    room[bottom][1] = 0


if __name__ == '__main__':
    r, c, t = map(int, input().split())
    room = [list(map(int, input().split())) for _ in range(r)]
    top, bottom = [i for i in range(r) if room[i][0] == -1]
    dusts = deque()
    for _ in range(t):
        find_dusts()
        spread_dusts()
        remove_dusts()

    print(2 + sum(sum(v) for v in room))