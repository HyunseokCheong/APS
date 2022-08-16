for tc in range(int(input())):
    word = list(input())
    N = len(word)
    # 변환
    for i in range(0, N):
        if word[i] == 'b':
            word[i] = 'd'
        elif word[i] == 'd':
            word[i] = 'b'
        elif word[i] == 'p':
            word[i] = 'q'
        elif word[i] == 'q':
            word[i] = 'p'
    # 순서 변환
    for i in range(N // 2):
        word[i], word[N - i - 1] = word[N - i - 1], word[i]
    # 출력
    print(f'#{tc + 1}', end=' ')
    print(*word, sep='')