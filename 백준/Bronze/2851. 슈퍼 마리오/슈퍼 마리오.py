score = []
answer = 0
N = 0

for i in range(10):
    score.append(int(input()))

while N <= 9:
    answer += score[N]
    if answer == 100:
        break
    elif answer > 100:
        if answer - 100 <= 100 - (answer - score[N]):
            break
        else:
            answer = answer - score[N]
        break
    N += 1

print(answer)