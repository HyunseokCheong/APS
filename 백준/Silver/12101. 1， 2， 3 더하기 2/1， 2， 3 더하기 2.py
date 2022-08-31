def recur(depth, answer):
    global cnt
    if depth > N:
        return
    if N == depth:
        cnt += 1
        if cnt == K:
            print(answer[:-1])
            exit()
    for i in [1, 2, 3]:
        recur(depth + i, answer + str(i) + '+')


N, K = map(int, input().split())
cnt = 0
recur(0, '')
print(-1)
