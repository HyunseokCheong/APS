max_score = 0
max_yorisa = 0
for i in range(5):
    score = sum(list(map(int, input().split())))
    if score > max_score:
        max_score = score
        max_yorisa = i + 1
print(max_yorisa, max_score)