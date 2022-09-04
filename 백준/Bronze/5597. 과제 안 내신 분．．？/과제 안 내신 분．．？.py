class_room = set(range(1, 31))

for i in range(28):
    class_room.remove(int(input()))

for i in class_room:
    print(i)