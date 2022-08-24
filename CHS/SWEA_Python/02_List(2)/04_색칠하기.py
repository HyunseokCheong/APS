import sys

sys.stdin = open('04_색칠하기.txt')
for tc in range(int(input())):
    N = int(input())

    board = [[0] * 10 for _ in range(10)]
    answer = 0

    for i in range(N):
        r1, c1, r2, c2, color = map(int, input().split())
        for j in range(r1, r2 + 1):
            for k in range(c1, c2 + 1):
                board[j][k] += color
                if board[j][k] == 3:
                    answer += 1

    print(f'#{tc + 1} {answer}')
