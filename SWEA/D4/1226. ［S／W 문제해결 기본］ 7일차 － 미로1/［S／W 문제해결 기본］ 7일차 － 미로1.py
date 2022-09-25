dr = [1, -1, 0, 0]
dc = [0, 0, -1, 1]

for _ in range(10):
    tc = int(input())
    arr = [list(map(int, input())) for _ in range(16)]
    ans = 0

    x, y = 0, 0
    for i in range(16):
        for j in range(16):
            if arr[i][j] == 2:
                x, y = i, j
                break

    stack = [(x, y)]
    while stack:
        x, y = stack.pop()

        for i in range(4):
            nr = y + dr[i]
            nc = x + dc[i]
            if 0 <= nr < 16 and 0 <= nc < 16:
                if arr[nc][nr] == 0:
                    stack.append((nc, nr))
                    arr[nc][nr] = 1
                elif arr[nc][nr] == 3:
                    ans = 1
                    break
        if ans == 1:
            break
    print(f'#{tc} {ans}')