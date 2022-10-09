def solution(s1, s2):
    ans = 0
    for i in s1:
        for j in s2:
            if i == j:
                ans += 1
    return ans
