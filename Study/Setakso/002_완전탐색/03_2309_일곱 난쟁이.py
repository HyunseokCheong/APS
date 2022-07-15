dworf = []

for i in range(9):
    N = int(input())
    dworf.append(N)
dworf.sort()

for i in dworf:
    for j in dworf:
        if i == j:
            pass
        if sum(dworf) - 100 == i + j:
            dworf.remove(i)
            dworf.remove(j)

for i in dworf:
    print(i)
