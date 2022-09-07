scores = []
for i in range(5):
    score = list(map(int, input().split()))
    scores.append(sum(score))
print(scores.index(max(scores)) + 1, max(scores))