import sys

input = sys.stdin.readline
for tc in range(int(input())):
    A, *A_card = map(int, input().split())
    B, *B_card = map(int, input().split())

    fight = [0] * 5

    for i in range(A):
        fight[A_card[i]] += 1
    for i in range(B):
        fight[B_card[i]] -= 1

    for i in range(4, 0, -1):
        if fight[i] > 0:
            print('A')
            break
        elif fight[i] < 0:
            print('B')
            break
    else:
        print('D')