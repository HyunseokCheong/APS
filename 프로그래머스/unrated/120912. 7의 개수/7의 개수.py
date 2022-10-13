def solution(array):
    ans = 0
    for i in array:
        for j in str(i):
            if j == '7':
                ans += 1
    return ans
