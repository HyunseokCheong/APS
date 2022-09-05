avg = 0

for i in range(5):
    num = int(input())
    if num >= 40:
        avg += num
    else:
        avg += 40
print(avg // 5)