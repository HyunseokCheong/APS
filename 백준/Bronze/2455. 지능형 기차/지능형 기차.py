train = 0
station = []
for i in range(4):
    n1, n2 = map(int, input().split())
    train += n2 - n1
    station.append(train)
print(max(station))