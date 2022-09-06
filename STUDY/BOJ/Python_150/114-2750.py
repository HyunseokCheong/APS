def bubble_sort(list):
    len_list = len(list)
    for i in range(len_list - 1, 0, -1):
        for j in range(0, i):
            if list[j] > list[j + 1]:
                list[j], list[j + 1] = list[j + 1], list[j]
    return list


num_list = []
for tc in range(int(input())):
    num_list.append(int(input()))
bubble_sort(num_list)
for i in range(0, len(num_list)):
    print(num_list[i])