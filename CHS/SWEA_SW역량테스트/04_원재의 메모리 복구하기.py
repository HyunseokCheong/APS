import sys

sys.stdin = open('04_원재의 메모리 복구하기.txt')
for tc in range(int(input())):
    word = input()
    N = len(word)

    answer = 0
    if word[0] == '1':
        answer += 1
    for i in range(1, N):
        if word[i] != word[i - 1]:
            answer += 1
    print(f'#{tc + 1} {answer}')
