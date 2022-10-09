def solution(money):
    ans = [0, 0]
    ans[0] = money // 5500
    ans[1] = money % 5500
    return ans
