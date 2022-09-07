dwf = []

for i in range(9):
    dwf.append(int(input()))
dwf.sort()

for i in dwf:
    for j in dwf:
        if i == j:
            pass
        if sum(dwf) - 100 == i + j:
            dwf.remove(i)
            dwf.remove(j)
            break

print(*dwf, sep='\n')
