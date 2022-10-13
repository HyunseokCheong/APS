from collections import deque


def rotate_right(x, di):
    if x > 4 or dic[x - 1][2] == dic[x][6]:
        return
    if dic[x - 1][2] != dic[x][6]:
        rotate_right(x + 1, -di)
        dic[x].rotate(di)


def rotate_left(x, di):
    if x < 1 or dic[x][2] == dic[x + 1][6]:
        return
    if dic[x][2] != dic[x + 1][6]:
        rotate_left(x - 1, -di)
        dic[x].rotate(di)


dic = {}
for i in range(1, 5):
    dic[i] = deque((map(int, input())))
for i in range(int(input())):
    t, d = map(int, input().split())
    rotate_right(t + 1, -d)
    rotate_left(t - 1, -d)
    dic[t].rotate(d)

ans = 0
for i in range(4):
    ans += dic[i + 1][0] * (2 ** i)
print(ans)
