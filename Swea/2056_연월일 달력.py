T = int(input())
for i in range(1, T + 1):
    date = input()
    Y = date[0:4]
    M = date[4:6]
    D = date[6:8]
    if int(M) in [1, 3, 5, 7, 8, 10, 12] and 0 < int(D) < 32:
        print(f'#{i} {Y}/{M}/{D}')
    elif int(M) in [4, 6, 9, 11] and 0 < int(D) < 31:
        print(f'#{i} {Y}/{M}/{D}')
    elif int(M) == 2 and 0 < int(D) < 29:
        print(f'#{i} {Y}/{M}/{D}')
    else:
        print(f'#{i} -1')