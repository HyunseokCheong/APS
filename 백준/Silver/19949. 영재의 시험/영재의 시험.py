def rec(idx):
    global ans
    if idx == 10:
        cnt = 0
        for i in range(10):
            if visited[i] == ans_list[i]:
                cnt += 1
        if cnt >= 5:
            ans += 1
        return
    else:
        for i in range(1, 6):
            if idx >= 2 and visited[idx - 1] == i and visited[idx - 2] == i:
                continue
            visited[idx] = i
            rec(idx + 1)
            visited[idx] = 0
    pass


ans_list = list(map(int, input().split()))
visited = [False] * 10
ans = 0
rec(0)
print(ans)
