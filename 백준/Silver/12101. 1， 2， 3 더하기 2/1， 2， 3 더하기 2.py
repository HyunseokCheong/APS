def recur(string, value):
    global count
    if value > n:
        return
    if value == n:
        count += 1
        if count == k:
            print(string[:-1])
            exit()
    for i in (1, 2, 3):
        recur(string + str(i) + "+", value + i)


count = 0
n, k = map(int, input().split())
recur("", 0)
print(-1)