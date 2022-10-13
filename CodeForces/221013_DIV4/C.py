t = int(input())
for tc in range(t):
    input()
    arr = [list(input()) for _ in range(8)]
    for i in range(8):
        if arr[i].count('R') == 8:
            print('R')
            break
    else:
        print('B')
