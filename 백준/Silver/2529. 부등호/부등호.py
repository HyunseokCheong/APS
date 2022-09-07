# 입력
N = int(input()) + 1
sign = list(input().split())

visited = [False] * 10
temp = []


def compare(a, b, c):
    if c == '<':
        return a < b
    else:
        return a > b


def recur(depth, ans):
    if depth == N:
        temp.append(ans)
        return
    for i in range(10):
        if visited[i]:
            continue
        if depth == 0 or compare(ans[depth - 1], str(i), sign[depth - 1]):
            visited[i] = True
            recur(depth + 1, ans + str(i))
            visited[i] = False

recur(0, '')
print(temp[-1])
print(temp[0])