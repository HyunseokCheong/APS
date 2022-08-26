for tc in range(int(input())):
    N = int(input())
    deque = list(input().split())

    answer = []
    if N % 2 == 0:
        for i in range(N // 2):
            answer.append(deque[i])
            answer.append(deque[i + N // 2])
    else:
        for i in range(N // 2):
            answer.append(deque[i])
            answer.append(deque[i + N // 2 + 1])
        answer.append(deque[N // 2])

    print(f'#{tc + 1}', end=' ')
    print(*answer)