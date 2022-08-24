import sys

sys.stdin = open('02_회문.txt')


def palindrome(word):
    len_word = len(word)
    for i in range(len_word // 2):
        if word[i] != word[len_word - 1 - i]:
            return False
    return True


for tc in range(int(input())):
    N, M = map(int, input().split())
    board = [input() for _ in range(N)]

    temp = []

    # 가로
    for row in range(N):
        for col in range(0, N - M + 1):
            if palindrome(board[row][col:col + M]):
                temp.append(board[row][col:col + M])
                break
        if temp:
            break

    # 세로
    if not temp:
        for row in range(0, N - M + 1):
            for col in range(N):
                col_list = []
                for i in range(M):
                    col_list.append(board[row + i][col])
                if palindrome(col_list):
                    temp.append(''.join(col_list))
                    break
            if temp:
                break

    print(f'#{tc + 1}', end=' ')
    print(*temp)
