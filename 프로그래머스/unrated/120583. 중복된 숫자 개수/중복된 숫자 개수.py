def solution(array, n):
    ans = 0
    for i in array:
        if i == n:
            ans += 1
    return ans
