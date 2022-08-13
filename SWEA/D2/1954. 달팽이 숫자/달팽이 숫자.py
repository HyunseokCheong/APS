'''
2
3
4
구현 계획: 우하좌상
'''
dr = [0, 1, 0, -1]
dc = [1, 0, -1, 0]

for tc in range(int(input())):
    N = int(input())
    snail = [[0] * N for _ in range(N)]
    r, c = 0, 0
    direction = 0

    for i in range(1, N ** 2 + 1):
        snail[r][c] = i
        r += dr[direction]
        c += dc[direction]
        if r < 0 or c < 0 or r >= N or c >= N or snail[r][c] != 0:
            r -= dr[direction]
            c -= dc[direction]
            direction = (direction + 1) % 4
            r += dr[direction]
            c += dc[direction]
    print(f'#{tc + 1}')
    for i in snail:
        print(*i)