for tc in range(int(input())):
    word = list(input())
    N = len(word)
    # 각 문자들을 거울에 비친 모습으로 변경
    for i in range(0, N):
        if word[i] == 'b':
            word[i] = 'd'
        elif word[i] == 'd':
            word[i] = 'b'
        elif word[i] == 'p':
            word[i] = 'q'
        elif word[i] == 'q':
            word[i] = 'p'
    # 문자 위치 변경
    for i in range(N // 2):
        word[i], word[N - 1 - i] = word[N - 1 - i], word[i]
    # 출력
    print(f'#{tc + 1}', end=' ')
    print(*word, sep='')