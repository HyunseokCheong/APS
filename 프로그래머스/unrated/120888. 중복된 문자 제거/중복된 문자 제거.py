def solution(my_string):
    ans = ''
    for i in my_string:
        if i not in ans:
            ans += i
    return ans
