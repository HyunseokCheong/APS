import sys

input = sys.stdin.readline

n = int(input())
arr_n = sorted(list(map(int, input().split())))
m = int(input())
arr_m = list(map(int, input().split()))

dic = {}
for i in arr_n:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1


def binarysearch(arr, target, s, e):
    if s > e:
        return 0
    mid = (s + e) // 2
    if arr[mid] == target:
        return dic.get(target)
    elif arr[mid] < target:
        return binarysearch(arr, target, mid + 1, e)
    elif arr[mid] > target:
        return binarysearch(arr, target, s, mid - 1)


for i in arr_m:
    print(binarysearch(arr_n, i, 0, n - 1), end=' ')
