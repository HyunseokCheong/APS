T = int(input())
for i in range(T):
    N = int(input())
    yoty_school = ''
    yoty_score = 0
    for j in range(N):
        school, score = input().split()
        score = int(score)
        if score > yoty_score:
            yoty_school = school
            yoty_score = score
    print(yoty_school)