for tc in range(10):
    T = int(input())
    board = [list(map(int, input().split())) for _ in range(100)]

    max_val = 0

    # 가로
    for i in range(100):
        temp = 0
        for j in range(100):
            temp += board[i][j]
        if temp > max_val:
            max_val = temp

    # 세로
    for i in range(100):
        temp = 0
        for j in range(100):
            temp += board[j][i]
        if temp > max_val:
            max_val = temp

    # 대각선
    temp1 = 0
    temp2 = 0
    for i in range(100):
        temp1 += board[i][i]
        temp2 += board[i][99 - i]

    if temp1 > max_val:
        max_val = temp1
    if temp2 > max_val:
        max_val = temp2

    print(f'#{tc + 1} {max_val}')