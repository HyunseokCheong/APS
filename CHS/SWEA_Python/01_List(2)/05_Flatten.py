import sys

sys.stdin = open('05_Flatten.txt')


def bubble_sort(li):
    N = len(li)
    for i in range(N - 1, 0, -1):
        for j in range(0, i):
            if li[j] > li[j + 1]:
                li[j], li[j + 1] = li[j + 1], li[j]


for tc in range(10):
    dump = int(input())
    boxes = list(map(int, input().split()))
    len_boxes = len(boxes)
    for i in range(dump):
        bubble_sort(boxes)
        boxes[0] += 1
        boxes[-1] -= 1

    bubble_sort(boxes)
    max_box = boxes[-1]
    min_box = boxes[0]
    answer = max_box - min_box

    print(f'#{tc + 1} {answer}')
