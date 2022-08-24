N = int(input())
answer = 0
temp = 0
while True:
    answer += temp
    temp += 1
    if answer >= N:
        break
print(answer)