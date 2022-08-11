N = int(input())
score = list(map(int, input().split()))

score.sort()

new_score = []

for i in score:
    a = i / max(score) * 100
    new_score.append(a)

print(sum(new_score) / N)