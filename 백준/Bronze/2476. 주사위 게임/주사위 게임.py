N = int(input())
rank = []

for i in range(N):
    A, B, C = map(int, input().split())
    if A == B == C:
        score = 10000 + (A * 1000)
    elif A == B or A == C:
        score = 1000 + (A * 100)
    elif B == C:
        score = 1000 + (B * 100)
    else:
        score = max(A, B, C) * 100
    rank.append(score)
    
print(max(rank))