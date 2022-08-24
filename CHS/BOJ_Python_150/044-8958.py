import sys

input = sys.stdin.readline

T = int(input())
for i in range(T):
    quiz = input()
    score = 0
    sum_score = 0
    for j in quiz:
        if j == 'O':
            score += 1
            sum_score += score
        else:
            score = 0
    print(sum_score)