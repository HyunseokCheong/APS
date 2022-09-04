dish = list(str(input()))
score = 0

for i in range(len(dish)):
    if i == 0:
        score += 10
    else:
        if dish[i] == dish[i - 1]:
            score += 5
        else:
            score += 10
print(score)