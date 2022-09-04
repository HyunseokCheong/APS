N = int(input())
student = []

for i in range(N):
    W, H = map(int, input().split())
    student.append((W, H))

for i in student:
    rank = 1
    for j in student:
        if i[0] < j[0] and i[1] < j[1]:
            rank += 1
    print(rank, end=" ")