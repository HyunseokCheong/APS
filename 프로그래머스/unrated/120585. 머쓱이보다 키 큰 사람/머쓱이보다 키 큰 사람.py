def solution(array, height):
    ans = 0
    for i in array:
        if i > height:
            ans += 1
    return ans
