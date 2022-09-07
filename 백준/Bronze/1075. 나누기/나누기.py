N = int(input())
F = int(input())

for i in range(0, 100):
    if ((N // 100) * 100 + i) % F == 0:
        answer = ((N // 100) * 100 + i) % 100
        break

print(f'{answer:02d}')