def rec(idx, depth):
    if depth == N:
        tmp = set(batch)
        cnt = 0
        for sk in skills:
            for s in sk:
                if s not in tmp:
                    break
            else:
                cnt += 1
        global answer
        if cnt > answer:
            answer = cnt
        return
    for i in range(idx + 1, 2 * N + 1):
        batch[depth] = i
        rec(i, depth + 1)


N, M, K = map(int, input().split())
skills = [list(map(int, input().split())) for _ in range(M)]
batch = [0] * N
answer = 0

rec(0, 0)
print(answer)
