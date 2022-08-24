import sys

sys.stdin = open('01_글자수.txt')
for tc in range(int(input())):
    A = list(input())
    B = list(input())

    max_cnt = 0
    for i in A:
        cnt = 0
        for j in B:
            if i == j:
                cnt += 1
        if cnt > max_cnt:
            max_cnt = cnt

    print(f'#{tc + 1} {max_cnt}')