N = int(input())
arr = list(map(int, input().split()))
arr.sort()

if len(arr) % 2 == 0:
    # even
    answer = arr[len(arr) // 2 - 1]
else:
    # odd
    answer = arr[len(arr) // 2]

print(answer)