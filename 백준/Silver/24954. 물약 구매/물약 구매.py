def recur(depth):
    global min_price
    if depth == N:
        temp = potions[:]
        price = 0

        for i in arr:
            price += temp[i]
            for j, k in discount[i]:
                temp[j - 1] = max(1, temp[j - 1] - k)
        min_price = min(min_price, price)
        return

    for i in range(N):
        if visited[i]:
            continue

        arr[depth] = i
        visited[i] = True
        recur(depth + 1)
        visited[i] = False


N = int(input())
potions = list(map(int, input().split()))
discount = [[] for _ in range(N)]
for i in range(N):
    M = int(input())
    for j in range(M):
        discount[i].append(list(map(int, input().split())))

arr = [0] * N
min_price = 10 ** 9
visited = [False] * (N + 1)

recur(0)

print(min_price)