def solution(n, k):
    if n >= 10:
        k = k - (n // 10)
    ans = n * 12000 + k * 2000
    return ans
