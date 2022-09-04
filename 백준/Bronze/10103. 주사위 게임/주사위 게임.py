n = int(input())
score_A = 100
score_B = 100

for i in range(n):
    a, b = map(int, input().split())
    if a > b:
        score_B -= a
    elif a < b:
        score_A -= b

print(score_A, score_B, sep='\n')