n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
arr2 = [list(map(int, input().split())) for _ in range(n)]


def rotate(arr):
    return [[row[i] for row in arr[::-1]] for i in range(len(arr[0]))]


def check(arr, arr2):
    for i in range(n):
        for j in range(n):
            if arr[i][j] == 1 and arr2[i][j] != 1:
                return False
    return True


for i in range(4):
    if check(arr, arr2):
        print('Yes')
        exit()
    arr = rotate(arr)
print('No')
