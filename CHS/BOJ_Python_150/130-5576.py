W_score = []
for w in range(10):
    W_score.append(int(input()))
W_score.sort()
W_top3 = sum(W_score[7:10])

K_score = []
for k in range(10):
    K_score.append(int(input()))
K_score.sort()
K_top3 = sum(K_score[7:10])

print(W_top3, K_top3)