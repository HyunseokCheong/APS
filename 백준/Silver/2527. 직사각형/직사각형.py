import sys

input = sys.stdin.readline
'''
D 벗어난 경우
C 점이 일치하는 경우
B 선분의 일부가 일치하는 경우
A 그 외(면의 일부가 일치하는 경우)
'''
for _ in range(4):
    x1, y1, p1, q1, x2, y2, p2, q2 = map(int, input().split())

    xdiff = min(p1, p2) - max(x1, x2)
    ydiff = min(q1, q2) - max(y1, y2)

    if xdiff > 0 and ydiff > 0:
        print('a')
    elif xdiff < 0 or ydiff < 0:
        print('d')
    elif xdiff == 0 and ydiff == 0:
        print('c')
    else:
        print('b')
