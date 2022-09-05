word = list(input().split('-'))
initial = []

for i in word:
    initial.append(i[0])

for i in initial:
    print(i, end='')