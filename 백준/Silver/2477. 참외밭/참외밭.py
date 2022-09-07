K = int(input())

D_list = []
L_list = []

for i in range(6):
    D, L = map(int, input().split())
    D_list.append(D)
    L_list.append(L)

max_width = 0
max_width_idx = 0
max_height = 0
max_height_idx = 0

for i in range(6):
    if (D_list[i] == 1 or D_list[i] == 2) and L_list[i] > max_width:
        max_width = L_list[i]
        max_width_idx = i
    elif (D_list[i] == 3 or D_list[i] == 4) and L_list[i] > max_height:
        max_height = L_list[i]
        max_height_idx = i

temp_width = L_list[max_height_idx - 1] - L_list[(max_height_idx + 1) % 6]
if temp_width < 0:
    temp_width = -temp_width

temp_height = L_list[max_width_idx - 1] - L_list[(max_width_idx + 1) % 6]
if temp_height < 0:
    temp_height = -temp_height

print(K * ((max_width * max_height) - (temp_width * temp_height)))
