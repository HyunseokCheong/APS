# 입력
for tc in range(int(input())):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]

    # 구현
    answer = 0
    for i in range(0, N - M + 1):
        for j in range(0, N - M + 1):

            temp = 0
            for k in range(i, i + M):
                for l in range(j, j + M):
                    temp += board[k][l]

            if temp > answer:
                answer = temp

    # 출력
    print(f'#{tc + 1} {answer}')