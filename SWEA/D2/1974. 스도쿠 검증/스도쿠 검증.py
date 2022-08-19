for tc in range(int(input())):
    board = [list(map(int, input().split())) for i in range(9)]

    answer = 1

    # 가로, 세로
    for i in range(0, 9):
        temp_col = set()
        temp_row = set()
        temp_3X3 = set()
        for j in range(0, 9):
            temp_col.add(board[i][j])
            temp_row.add(board[j][i])

            # 3X3
            if i % 3 == 0 and j % 3 == 0:
                for k in range(i, i + 3):
                    for l in range(j, j + 3):
                        temp_3X3.add(board[k][l])

                # 3X3 검증
                if len(temp_3X3) != 9:
                    answer = 0
                    break

        # 가로, 세로 검증
        if len(temp_col) != 9 or len(temp_row) != 9:
            answer = 0
            break

    print(f'#{tc + 1} {answer}')