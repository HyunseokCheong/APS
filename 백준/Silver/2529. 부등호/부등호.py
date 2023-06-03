def check(x, y, s):
    if s == '<':
        return x < y
    return x > y


def recur(string, depth):
    if depth == n + 1:
        answer_list.append(string)
        return
    for i in range(10):
        if visited[i]:
            continue
        if depth == 0:
            visited[i] = True
            recur(string + str(i), depth + 1)
            visited[i] = False
        else:
            x = int(string[depth - 1])
            y = i
            s = sign_list[depth - 1]
            if check(x, y, s):
                visited[i] = True
                recur(string + str(i), depth + 1)
                visited[i] = False


n = int(input())
sign_list = list(input().split())
answer_list = list()
visited = [False] * 10
recur("", 0)

print(answer_list[-1])
print(answer_list[0])