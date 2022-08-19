for tc in range(int(input())):
    N = int(input())

    A = B = C = D = E = 0

    while N != 1:
        if N % 2 == 0:
            N //= 2
            A += 1
        if N % 3 == 0:
            N //= 3
            B += 1
        if N % 5 == 0:
            N //= 5
            C += 1
        if N % 7 == 0:
            N //= 7
            D += 1
        if N % 11 == 0:
            N //= 11
            E += 1
    
    print(f'#{tc + 1} {A} {B} {C} {D} {E}')