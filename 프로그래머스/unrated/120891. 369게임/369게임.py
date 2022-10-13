arr = ['3', '6', '9']


def solution(order):
    ans = 0
    for i in str(order):
        if i in arr:
            ans += 1
    return ans
