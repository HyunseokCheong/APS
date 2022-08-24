passenger = 0
max_passenger = 0
for _ in range(4):
    unload, load = map(int, input().split())
    passenger -= unload
    passenger += load
    if passenger > max_passenger:
        max_passenger = passenger
print(max_passenger)