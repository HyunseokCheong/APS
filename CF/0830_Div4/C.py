for tc in range(int(input())):
    N = int(input())
    board = [list(input().split()) for _ in range(3)]
    split_list = [i for j in board for i in j]
    score = [0] * 3
    for i in range(3):
        for j in range(N):
            if split_list.count(board[i][j]) == 1:
                score[i] += 3
            elif split_list.count(board[i][j]) == 2:
                score[i] += 1

    print(*score)
