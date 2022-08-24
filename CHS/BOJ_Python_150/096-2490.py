for _ in range(3):
    yut = list(map(int, input().split()))
    temp = sum(yut)
    if temp == 0:
        print('D')
    elif temp == 1:
        print('C')
    elif temp == 2:
        print('B')
    elif temp == 3:
        print('A')
    elif temp == 4:
        print('E')