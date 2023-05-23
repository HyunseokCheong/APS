n = int(input())
q = int(input())
box = [[0] for _ in range(200001)]
box2 = [[0] for _ in range(200001)]
for i in range(q):
    sq = list(map(int, input().split()))
    if sq[0] == 1:
        i = sq[1]
        j = sq[2]
        box[j].append(i)

        if j not in box2[i]:
            box2[i].append(j)
    elif sq[0] == 2:
        i = sq[1]
        box[i].sort()
        for j in range(1, len(box[i])):
            print(box[i][j], end=' ')
        print()
    elif sq[0] == 3:
        i = sq[1]
        box2[i].sort()
        for j in range(1, len(box2[i])):
            print(box2[i][j], end=' ')
        print()
