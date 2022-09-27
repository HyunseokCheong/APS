def solution(n):
    if int(n ** 0.5) ** 2 == n:
        return (int(n ** 0.5) + 1) ** 2
    return -1
