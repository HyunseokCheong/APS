def solution(n):
    ans = []
    for i in range(1, n + 1):
        if i % 2 != 0:
            ans.append(i)
    return ans
