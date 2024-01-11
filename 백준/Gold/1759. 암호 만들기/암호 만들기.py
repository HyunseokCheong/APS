def check(string):
    mo = 0
    ja = 0
    vowel = ['a', 'e', 'i', 'o', 'u']
    for i in string:
        flag = False
        for j in vowel:
            if i == j:
                mo += 1
                flag = True
                break
        if flag:
            continue
        ja += 1

    return mo >= 1 and ja >= 2


def solve(string, depth, start):
    if depth == l:
        if check(string):
            print(string)
        return
    for i in range(start, c):
        if visited[i]:
            continue
        visited[i] = True
        solve(string + arr[i], depth + 1, i + 1)
        visited[i] = False


l, c = map(int, input().split())
arr = sorted(list(input().split()))
visited = [False] * c

solve("", 0, 0)