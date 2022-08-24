def bublle_sort(li):
    len_list = len(li)
    for i in range(len_list - 1, 0, -1):
        for j in range(0, i):
            if li[j] > li[j + 1]:
                li[j], li[j + 1] = li[j + 1], li[j]
    return li

score_list = []
sort_score_list = []
for i in range(8):
    score = int(input())
    score_list.append(score)
    sort_score_list.append(score)

bublle_sort(sort_score_list)
top_score = sort_score_list[3:]

sum_num = 0
for i in range(0, 5):
    sum_num += top_score[i]

index_list = []
for i in range(0, 8):
    for j in range(0, 5):
        if score_list[i] == top_score[j]:
            index_list.append(i + 1)

print(sum_num)
print(*index_list)