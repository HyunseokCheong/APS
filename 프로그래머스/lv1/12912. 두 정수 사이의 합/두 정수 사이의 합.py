def solution(a, b):
    ans = 0
    a, b = min(a, b), max(a, b)
    for i in range(a, b + 1):
        ans += i
    return ans
