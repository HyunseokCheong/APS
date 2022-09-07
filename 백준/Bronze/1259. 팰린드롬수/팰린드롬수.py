while True:
    N = int(input())
    if N == 0:
        break
    N = str(N)
    if N == N[::-1]:
        print('yes')
    else:
        print('no')