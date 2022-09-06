def bubble_sort(li):
    len_list = len(li)
    for i in range(len_list - 1, 0, -1):
        for j in range(0, i):
            if li[j] > li[j + 1]:
                li[j], li[j + 1] = li[j + 1], li[j]
    return li

dwarf_list = []
for i in range(9):
    dwarf_list.append(int(input()))

target = - 100
for i in range(0, 9):
    target += dwarf_list[i]

fake_dwarf_list = []
for i in range(0, 9):
    for j in range(0, 9):
        if dwarf_list[i] == dwarf_list[j]:
            continue
        elif dwarf_list[i] + dwarf_list[j] == target:
            fake_dwarf_list.append(dwarf_list[i])
            fake_dwarf_list.append(dwarf_list[j])
            break

bubble_sort(dwarf_list)
for i in range(0, 9):
    cnt = 0
    for j in range(0, 2):
        if dwarf_list[i] == fake_dwarf_list[j]:
            cnt += 1
    if cnt == 0:
        print(dwarf_list[i])