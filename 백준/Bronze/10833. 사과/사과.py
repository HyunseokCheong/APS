N = int(input())
sum_apple = 0
for i in range(N):
    student, apple = map(int, input().split())
    sum_apple += (apple % student)
print(sum_apple)