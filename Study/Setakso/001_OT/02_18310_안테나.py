N = int(input())
arr = list(map(int, input().split()))
arr.sort()

if N % 2 == 0:
    # even
    print(arr[N // 2 - 1])
else:
    # odd
    print(arr[N // 2])