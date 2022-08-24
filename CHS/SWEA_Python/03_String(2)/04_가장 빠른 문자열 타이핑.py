import sys

sys.stdin = open('04_가장 빠른 문자열 타이핑.txt')
for tc in range(int(input())):
    A, B = input().split()

    i = 0
    cnt = 0

    while i != len(A):
        if A[i:i + len(B)] == B:
            cnt += 1
            i += len(B)
            continue
        cnt += 1
        i += 1

    print(f'#{tc + 1} {cnt}')
