
for tc in range(int(input())):
    max_len = 0
    temp = []
    for i in range(5):
        word = input()
        if len(word) > max_len:
            max_len = len(word)
        temp.append(word)
    board = [[10] * max_len for _ in range(max_len)]

    print(f'#{tc + 1}', end=' ')
    for i in range(5):
        for j in range(0, len(temp[i])):
            board[i][j] = temp[i][j]
    for i in range(0, max_len):
        for j in range(0, max_len):
            if board[j][i] != 10:
                print(board[j][i], end='')
    print()