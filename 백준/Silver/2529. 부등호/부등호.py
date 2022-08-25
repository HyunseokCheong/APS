N = int(input())
M = 10
sign = list(input().split())
visited = [False for i in range(M)]
max_val = ''
min_val = ''


def compare(i, j, k):
    if k == '<':
        return i < j
    else:
        return i > j
    # return True


def bt(cnt, word):
    global max_val, min_val
    if cnt == N + 1:
        if not len(min_val):
            min_val = word
        else:
            max_val = word
        return
    for i in range(M):
        if not visited[i]:
            if cnt == 0 or compare(word[-1], str(i), sign[cnt - 1]):
                visited[i] = True
                bt(cnt + 1, word + str(i))
                visited[i] = False

bt(0, '')
print(max_val)
print(min_val)