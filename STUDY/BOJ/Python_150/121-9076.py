def bubble_sort(li):
    len_list = len(li)
    for i in range(len_list - 1, 0, -1):
        for j in range(0, i):
            if li[j] > li[j + 1]:
                li[j], li[j + 1] = li[j + 1], li[j]
    return li


for tc in range(int(input())):
    score = list(map(int, input().split()))
    bubble_sort(score)
    result = 0
    if score[3] - score[1] >= 4:
        print('KIN')
    else:
        for i in range(1, 4):
            result += score[i]
        print(result)