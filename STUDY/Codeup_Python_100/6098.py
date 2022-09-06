import sys

input = sys.stdin.readline

# 미로 입력
miro = []
for i in range(10):
    miro.append(list(map(int, input().split())))

x, y = 1, 1

while True:
    if miro[x][y] == 0:
        miro[x][y] = 9
    elif miro[x][y] == 2:
        miro[x][y] = 9
        break

    if miro[x][y + 1] == 1 and miro[x + 1][y] == 1:
        break

    if miro[x][y + 1] != 1:
        y = y + 1
    elif miro[x + 1][y] != 1:
        x = x + 1
for i in miro:
    print(*i)