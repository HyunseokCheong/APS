N = int(input())
result = 0
for i in range(N):
    student, apple = map(int, input().split())
    result += apple % student
print(result)