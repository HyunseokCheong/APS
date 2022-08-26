import sys

sys.stdin = open('09_오목 판정.txt')
for tc in range(int(input())):
    N = int(input())
    board = [input() for _ in range(N)]


    def omok():
        dr = [0, 1, 1, 1]
        dc = [1, 0, 1, -1]

        for i in range(N):
            for j in range(N):
                if board[i][j] == 'o':
                    for dir in range(4):
                        nr = i
                        nc = j
                        cnt = 0

                        while 0 <= nr < N and 0 <= nc < N and board[nr][nc] == 'o':
                            cnt += 1
                            nr += dr[dir]
                            nc += dc[dir]
                            if cnt == 5:
                                return 'YES'
        return 'NO'


    print(f'#{tc + 1} {omok()}')
