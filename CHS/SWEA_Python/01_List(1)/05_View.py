import sys

sys.stdin = open('05_View.txt')
for tc in range(10):
    N = int(input())
    buildings = list(map(int, input().split()))

    cnt = 0
    max_around_height = 0

    for i in range(2, N - 2):
        temp = max(buildings[i - 2], buildings[i - 1], buildings[i + 1], buildings[i + 2])
        if buildings[i] > temp:
            max_around_height = temp
            cnt += (buildings[i] - max_around_height)

    print(f'#{tc + 1} {cnt}')
