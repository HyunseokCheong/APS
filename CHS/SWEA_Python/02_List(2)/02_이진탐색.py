import sys

sys.stdin = open('02_이진탐색.txt')


def binary_search(page, target):
    S = 1
    E = page
    cnt = 0
    while S <= E:
        M = (S + E) // 2
        if target == M:
            return cnt
        elif target > M:
            S = M
            cnt += 1
        elif target < M:
            E = M
            cnt += 1


for tc in range(int(input())):
    P, A, B = map(int, input().split())

    cnt_A = binary_search(P, A)
    cnt_B = binary_search(P, B)

    if cnt_A == cnt_B:
        answer = '0'
    elif cnt_A > cnt_B:
        answer = 'B'
    else:
        answer = 'A'

    print(f'#{tc + 1} {answer}')
