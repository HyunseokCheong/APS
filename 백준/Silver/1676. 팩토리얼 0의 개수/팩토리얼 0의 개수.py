from math import factorial

N = int(input())
cnt = 0
for i in str(factorial(N))[::-1]:
    if i != '0':
        break
    cnt += 1
print(cnt)