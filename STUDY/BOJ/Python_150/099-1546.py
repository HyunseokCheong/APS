N = int(input())
score_list = list(map(int, input().split()))
max_score = max(score_list)
new_score = 0
for i in score_list:
    new_score += i / max_score * 100
print(new_score / N)