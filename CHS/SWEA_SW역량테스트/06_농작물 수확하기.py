import sys

sys.stdin = open('06_농작물 수확하기.txt')
for tc in range(int(input())):
    N = int(input())

    answer = 0
    for i in range(N):
        word = input()
        if i > N // 2:
            i = i - (2 * (i - N // 2))
        if i <= N // 2:
            for j in range(N // 2 - i, N // 2 + i + 1):
                answer += int(word[j])

    print(f'#{tc + 1} {answer}')