L = int(input())
A = int(input())
B = int(input())
C = int(input())
D = int(input())

day = []

if A % C != 0:
    day.append(A // C + 1)
else:
    day.append(A // C)

if B % D != 0:
    day.append(B // D + 1)
else:
    day.append(B // D)

answer = L - max(day)
print(answer)