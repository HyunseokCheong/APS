# 입력
for tc in range(int(input())):
    N = int(input())

    # 구현
    temp = [2, 3, 5, 7, 11]
    answer = [0] * 5
    i = 0
    while i < 5:
        if N % temp[i] == 0:
            N //= temp[i]
            answer[i] += 1
        else:
            i += 1

    # 출력
    print(f'#{tc + 1}', end=' ')
    print(*answer)