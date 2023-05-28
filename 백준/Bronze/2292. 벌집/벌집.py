n = int(input())
b = 1
cnt = 1
while n > b:
    b += 6 * cnt
    cnt += 1
print(cnt)
