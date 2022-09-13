def rec(idx, depth, target):
    global ans
    if depth == target:
        taste1 = 1
        taste2 = 0
        for i in temp_list:
            taste1 *= i[0]
            taste2 += i[1]
        ans = min(ans, abs(taste1 - taste2))
        return
    if idx == N:
        return
    temp_list.append(taste_list[idx])
    rec(idx + 1, depth + 1, target)
    temp_list.pop()
    rec(idx + 1, depth, target)


N = int(input())
taste_list = [list(map(int, input().split())) for _ in range(N)]
ans = 1e9
for i in range(1, N + 1):
    temp_list = []
    rec(0, 0, i)
print(ans)