for tc in range(int(input())):
    T = int(input())
    A = T // 25
    B = (T % 25) // 10
    C = ((T % 25) % 10) // 5
    D = ((T % 25) % 10) % 5
    print(A, B, C, D)