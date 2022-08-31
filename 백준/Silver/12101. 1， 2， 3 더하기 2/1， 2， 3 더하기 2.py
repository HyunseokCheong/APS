def go(n, rlt, rlt2, ans):
    if rlt == n:
        ans.append(rlt2)
        return
    elif rlt > n:
        return
    for i in range(1, 4):
        if rlt2 == '':
            rlt2 += str(i)
        else:
            rlt2 += ('+' + str(i))
        go(n, rlt + i, rlt2, ans)
        if '+' not in rlt2:
            rlt2 = ''
        else:
            rlt2 = rlt2[:-2]


def solution(n, k):
    ans = []
    go(n, 0, '', ans)
    if len(ans) < k:
        return -1
    return sorted(ans)[k - 1]



N, K = map(int, input().split())
print(solution(N, K))