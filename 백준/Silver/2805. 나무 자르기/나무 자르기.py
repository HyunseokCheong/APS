N, M = map(int, input().split())
tree_list = list(map(int, input().split()))
S = 1
E = max(tree_list)

while S <= E:
    mid = (S + E) // 2
    log_result = 0
    for i in tree_list:
        if i >= mid:
            log_result += i - mid
    if log_result >= M:
        S = mid + 1
    else:
        E = mid - 1
print(E)
