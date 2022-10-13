def solution(my_string):
    ans = 0
    for i in my_string:
        if i.isdigit():
            ans += int(i)
    return ans
