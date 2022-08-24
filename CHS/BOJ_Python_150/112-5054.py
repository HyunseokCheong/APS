def bubble_sort(li):
    N = len(li)
    for i in range(N - 1, 0, -1):
        for j in range(0, i):
            if li[j] > li[j + 1]:
                li[j], li[j + 1] = li[j + 1], li[j]
    return li

for tc in range(int(input())):
    N = int(input())
    stores = list(map(int, input().split()))
    bubble_sort(stores)
    answer = (stores[-1] - stores[0]) * 2
    print(answer)