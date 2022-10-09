def solution(n):
    ans = 0
    for i in range(n + 1):
        if i % 2 == 0:
            ans += i
    return ans
