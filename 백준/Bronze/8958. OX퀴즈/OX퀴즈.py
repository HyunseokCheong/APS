n = int(input())
for i in range(n):
    total = 0
    score = 0
    res = input()
    for j in res:
        if j == 'O':
            score += 1
            total += score
        else:
            score = 0
    print(total)
