def bublle_sort(li):
    N = len(li)
    for i in range(N - 1, 0, -1):
        for j in range(0, i):
            if li[j] > li[j + 1]:
                li[j], li[j + 1] = li[j + 1], li[j]


width, height = map(int, input().split())
X_list = [0, width]
Y_list = [0, height]
for k in range(int(input())):
    direction, position = map(int, input().split())
    if direction == 1:
        X_list.append(position)
    elif direction == 0:
        Y_list.append(position)

bublle_sort(X_list)
bublle_sort(Y_list)
max_X = 0
max_Y = 0
for i in range(1, len(X_list)):
    if X_list[i] - X_list[i - 1] > max_X:
        max_X = X_list[i] - X_list[i - 1]
for i in range(1, len(Y_list)):
    if Y_list[i] - Y_list[i - 1] > max_Y:
        max_Y = Y_list[i] - Y_list[i - 1]
print(max_X * max_Y)