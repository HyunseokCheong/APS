N = int(input())
fibo = []
for i in range(0, N + 1):
    if i == 0 or i == 1:
        fibo.append(i)
    else:
        fibo.append(fibo[i -2] + fibo[i - 1])
print(max(fibo))