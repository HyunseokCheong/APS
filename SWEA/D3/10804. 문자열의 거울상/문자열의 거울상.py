for tc in range(int(input())):
    word = list(input())
    for i in range(0, len(word)):
        if word[i] == 'b':
            word[i] = 'd'
        elif word[i] == 'd':
            word[i] = 'b'
        elif word[i] == 'p':
            word[i] = 'q'
        elif word[i] == 'q':
            word[i] = 'p'
    print(f'#{tc + 1}', end=' ')
    N = len(word)
    for i in range(N // 2):
        word[i], word[N - 1 - i] = word[N - 1 - i], word[i]
    for i in word:
        print(i, end='')
    print()