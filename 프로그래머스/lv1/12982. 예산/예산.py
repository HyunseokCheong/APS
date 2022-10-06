def solution(d, budget):
    ans = 0
    n = len(d)
    d.sort()
    for i in range(n):
        if budget >= d[i]:
            budget -= d[i]
            ans += 1
        else:
            break
    return ans
