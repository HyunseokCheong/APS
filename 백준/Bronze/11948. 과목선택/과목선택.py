arr_1 = [0] * 4
for i in range(4):
    arr_1[i] = int(input())
arr_2 = [0] * 2
for i in range(2):
    arr_2[i] = int(input())
arr_1.sort()
arr_2.sort()
print(sum(arr_1[1:4]) + arr_2[1])
