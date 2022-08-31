for tc in range(int(input())):
    col = int(input())
    temp = []
    for i in range(2):
        color = list(input())
        for j in range(0, col):
            if color[j] == 'G':
                color[j] = 'B'
        temp.append(color)
    if temp[0] == temp[1]:
        print('YES')
    else:
        print('NO')