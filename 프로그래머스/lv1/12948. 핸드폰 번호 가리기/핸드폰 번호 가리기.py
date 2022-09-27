def solution(n):
    answer = '*' * len(n[:-4]) + n[-4:]
    return answer
