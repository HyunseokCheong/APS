def bubble_sort(li):
    len_list = len(li)
    for i in range(len_list - 1, 0, -1):
        for j in range(0, i):
            if li[j] > li[j + 1]:
                li[j], li[j + 1] = li[j + 1], li[j]
    return li


for tc in range(int(input())):
    nums = list(map(int, input().split()))
    bubble_sort(nums)
    print(nums[7])