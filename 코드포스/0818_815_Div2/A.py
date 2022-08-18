for tc in range(int(input())):
    A, B, C, D = map(int, input().split())
    answer = 2
    if A / B == C / D:
        answer = 0
    elif B % D == 0 or D % B == 0:
        answer = 1
    elif A == 0 and C == 0:
        answer = 0
    elif A == 0 or C == 0:
        answer = 1
    elif A * D > C * B and (A * D) % (C * B) == 0:
        answer = 1
    elif A * D < C * B and (C * B) % (A * D) == 0:
        answer = 1
    print(answer)