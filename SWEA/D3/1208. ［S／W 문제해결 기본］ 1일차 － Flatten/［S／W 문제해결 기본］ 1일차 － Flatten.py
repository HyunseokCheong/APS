def dump(x):
    global arr
    for i in range(x):
        arr[arr.index(max(arr))] -= 1
        arr[arr.index(min(arr))] += 1
    return max(arr) - min(arr)


for tc in range(10):
    n = int(input())
    arr = list(map(int, input().split()))

    ans = dump(n)

    print(f'#{tc + 1} {ans}')