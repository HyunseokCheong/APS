T = int(input())
for i in range(T):
    N = int(input())
    credit = 0
    grade = 0

    for j in range(N):
        C, G = map(float, input().split())
        credit += C
        grade += C * G
    answer = grade / credit
    print(int(credit), '%.1f' % answer)