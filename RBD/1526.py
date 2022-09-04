N = int(input())
check = True
for i in range(N, 3, -1):
    for j in str(i):
        if j != '4' and j != '7':
            check = False
            break
        else:
            check = True
    if check == True:
        print(i)
        break
