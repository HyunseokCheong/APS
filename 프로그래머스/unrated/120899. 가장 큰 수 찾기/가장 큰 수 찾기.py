def solution(array):
    ans = [0] * 2
    ans[0] = max(array)
    ans[1] = array.index(max(array))
    return ans
