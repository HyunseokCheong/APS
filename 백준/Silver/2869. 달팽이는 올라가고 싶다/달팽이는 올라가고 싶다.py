a, b, v = map(int, input().split())
cnt = 0

v = v - b
if v % (a - b) == 0:
    cnt += v // (a - b)
else:
    cnt += v // (a - b) + 1

print(cnt)
