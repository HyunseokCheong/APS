import sys
input = sys.stdin.readline


def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2

        if array[mid] == target:
            return mid
        elif array[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return None


N = int(input())
card_list = list(map(int, input().split()))
card_list.sort()

M = int(input())
check_list = list(map(int, input().split()))

for i in range(M):
    if binary_search(card_list, check_list[i], 0, N - 1) is None:
        print(0, end=' ')
    else:
        print(1, end=' ')
