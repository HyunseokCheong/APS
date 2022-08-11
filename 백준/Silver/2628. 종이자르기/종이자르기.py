width, height = map(int, input().split())
width_list = [0, width]
height_list = [0, height]
for _ in range(int(input())):
    direction, target = map(int, input().split())
    if direction == 0:
        height_list.append(target)
    else:
        width_list.append(target)

width_list.sort()
height_list.sort()

area = 0
for i in range(1, len(width_list)):
    for j in range(1, len(height_list)):
        W = width_list[i] - width_list[i - 1]
        H = height_list[j] - height_list[j - 1]
        area = max(area, W * H)
print(area)
