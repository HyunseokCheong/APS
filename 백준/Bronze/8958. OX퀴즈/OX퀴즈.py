n = int(input())

for _ in range(n):
    data = list(input())
    score = 0
    temp = 0
    for i in range(len(data)):
        if data[i] == "X":
            temp = 0
            continue

        score += 1
        if i != 0 and data[i - 1] == "O":
            temp += 1
            score += temp

    print(score)