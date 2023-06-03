def recur(depth):
    global max_value
    if depth == n:
        value = 0
        for i in range(n - 1):
            value += abs(arr[temp[i]] - arr[temp[i + 1]])
        max_value = max(max_value, value)
        return

    for i in range(n):
        if visited[i]:
            continue

        visited[i] = True
        temp.append(i)
        recur(depth + 1)
        visited[i] = False
        temp.pop()


n = int(input())
arr = list(map(int, input().split()))
temp = []
max_value = -1e9
visited = [False] * n
recur(0)
print(max_value)
