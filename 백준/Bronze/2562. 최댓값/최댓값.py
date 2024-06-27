arr = [0] * 9

max_value = 0
max_index = 0

for i in range(9):
    arr[i] = int(input())
    if arr[i] > max_value:
        max_value = arr[i]
        max_index = i + 1

print(max_value, max_index, sep="\n")