passenger = 0
max_passenger = 0
for i in range(10):
    unload, load = map(int, input().split())
    passenger += load - unload
    max_passenger = max(max_passenger, passenger)
print(max_passenger)