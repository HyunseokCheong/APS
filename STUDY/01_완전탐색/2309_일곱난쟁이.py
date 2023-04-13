sq = [int(input()) for _ in range(9)]
su = sum(sq)

for i in range(9):
    for j in range(9):
        if i == j:
            continue
        if su - (sq[i] + sq[j]) == 100:
            sq[i], sq[j] = 0, 0
            break

sq.sort()
for i in range(2, 9):
    print(sq[i])
