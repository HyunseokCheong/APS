n = int(input())
arr = list(map(int, input().split()))
b, c = map(int, input().split())

answer = 0
for i in arr:
    if i <= b:
        answer += 1
    else:
        i -= b
        answer += 1
        if i % c == 0:
            answer += i // c
        else:
            answer += i // c + 1

print(answer)