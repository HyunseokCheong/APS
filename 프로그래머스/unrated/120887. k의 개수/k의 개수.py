def solution(i, j, k):
    ans = 0
    for n in range(i, j + 1):
        for m in str(n):
            if int(m) == k:
                ans += 1
    return ans
