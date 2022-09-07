N = int(input())
questions = list(map(int, input().split()))
score = 0
sum_score = 0
for i in questions:
    if i == 1:
        sum_score += 1
        score += sum_score
    elif i == 0:
        sum_score = 0
print(score)