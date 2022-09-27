def solution(num):
    idx = 0
    while idx < 500:
        if num == 1:
            break
        if num % 2 == 0:
            num //= 2
        else:
            num = num * 3 + 1
        idx += 1
    return idx if idx < 500 else -1
