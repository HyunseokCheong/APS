'''
구현 계획: 반복문으로 가로, 세로, 대각선1, 대각선2를 구하고 비교
'''
# input
for tc in range(10):
    T = int(input())
    board = [list(map(int, input().split())) for _ in range(100)]

    # implement
    max_value = 0

    # 가로
    for row in range(0, 100):
        temp = 0
        for column in range(0, 100):
            temp += board[row][column]
        if temp > max_value:
            max_value = temp

    # 세로
    for column in range(0, 100):
        temp = 0
        for row in range(0, 100):
            temp += board[row][column]
        if temp > max_value:
            max_value = temp

    # 대각선
    for rc in range(100):
        temp1 = 0
        temp2 = 0
        temp1 += board[rc][rc]
        temp2 += board[rc][99 - rc]
    if temp1 > max_value:
        max_value = temp1
    if temp2 > max_value:
        max_value = temp2
    
    # output
    print(f'#{tc + 1} {max_value}')