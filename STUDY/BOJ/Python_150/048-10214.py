import sys

input = sys.stdin.readline

T = int(input())
for i in range(T):
    score_Y = 0
    score_K = 0
    for j in range(9):
        Y, K = map(int, input().split())
        score_Y += Y
        score_K += K
    if score_Y > score_K:
        print('Yonsei')
    elif score_Y < score_K:
        print('Korea')
    else:
        print('Draw')