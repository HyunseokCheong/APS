def solution(x):
    res = 0
    for i in str(x):
        res += int(i)
    if x % res == 0:
        return True
    else:
        return False
