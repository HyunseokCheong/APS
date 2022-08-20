for tc in range(int(input())):
    word = list(input())

    answer = 1
    N = len(word)
    for i in range(N // 2):
        if word[i] != word[N - i - 1]:
            answer = 0
            break

    print(f'#{tc + 1} {answer}')