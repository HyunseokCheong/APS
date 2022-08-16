def palindrom(li):
    len_li = len(li)
    for l in range(len_li // 2):
        if li[l] != li[len_li - 1 - l]:
            return False
    return True


def func():
    cnt = 100
    while cnt >= 1:
        for m in range(100 - cnt + 1):
            for n in range(100 - cnt + 1):
                if palindrom(board[m][n:n + cnt]):
                    return cnt
                if palindrom(board2[m][n:n + cnt]):
                    return cnt
        cnt -= 1


for tc in range(10):
    T = int(input())
    board = [list(input()) for _ in range(100)]
    board2 = [[board[i][j] for i in range(100)] for j in range(100)]
    answer = func()
    print(f'#{T} {answer}')
