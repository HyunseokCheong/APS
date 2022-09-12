case = 1
while True:
    L, P, V = map(int, input().split())
    if L + P + V == 0:
        break
    day = 0
    day += (V // P) * L
    if V % P >= L:
        day += L
    else:
        day += V % P
    print(f'Case {case}: {day}')
    case += 1
