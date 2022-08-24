N = int(input())
for i in range(1, N + 1):
    if i % 10 == 0:
        print(i, end=' ')
    elif (i % 10) % 3 == 0:
        print('X', end=' ')
    else:
        print(i, end=' ')