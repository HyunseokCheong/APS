for tc in range(int(input())):
    board = [list(map(int, input().split())) for _ in range(9)]

    answer = 1

    for i in range(9):
        set_row = set()
        set_col = set()
        set_3X3 = set()

        for j in range(9):
            set_col.add(board[i][j])
            set_row.add(board[j][i])

            if i % 3 == 0 and j % 3 == 0:
                for k in range(i, i + 3):
                    for l in range(j, j + 3):
                        set_3X3.add(board[k][l])

                if len(set_3X3) != 9:
                    answer = 0
                    break

        if len(set_row) != 9 or len(set_col) != 9:
            answer = 0
            break

    print(f'#{tc + 1} {answer}')