import sys

sys.stdin = open('03_문자열 비교.txt')

for tc in range(int(input())):
    str1 = input()
    str2 = input()

    answer = 0
    for i in range(0, len(str2) - len(str1) + 1):
        if str1 == str2[i:i + len(str1)]:
            answer = 1

    print(f'#{tc + 1} {answer}')
