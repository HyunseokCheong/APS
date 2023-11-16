a, b, c = map(int, input().split())
li = [0] * 101
for i in range(3):
    x, y = map(int, input().split())
    for j in range(x, y):
        li[j] += 1

result = 0
for i in range(len(li)):
    if li[i] == 1:
        result += a
    if li[i] == 2:
        result += b * 2
    if li[i] == 3:
        result += c * 3
print(result)