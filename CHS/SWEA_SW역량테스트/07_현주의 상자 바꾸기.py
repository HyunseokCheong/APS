import sys

sys.stdin = open('07_현주의 상자 바꾸기.txt')
for tc in range(int(input())):
    N, Q = map(int, input().split())

    boxes = [0] * N
    for i in range(Q):
        L, R = map(int, input().split())
        for j in range(L-1, R):
            boxes[j] = i+1

    print(f'#{tc + 1}', end=' ')
    print(*boxes)