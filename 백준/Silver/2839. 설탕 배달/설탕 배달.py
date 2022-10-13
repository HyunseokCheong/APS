candy = int(input())
cnt = 0

while candy != 0:
    if candy % 5 != 0:
        candy -= 3
        cnt += 1
    else:
        cnt += candy // 5
        break
if candy < 0:
    cnt = -1
print(cnt)
