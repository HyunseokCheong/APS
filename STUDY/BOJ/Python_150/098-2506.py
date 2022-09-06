N = int(input())
score_list = list(map(int, input().split()))
score = 0
sum_score = 0
for i in score_list:
    if i == 1:
        score += 1
        sum_score += score
    else:
        score = 0
print(sum_score)