def solution(A):
    A.sort()
    if len(A) == 0:
        return 1
    mnv = 1
    for i in range(len(A)):
        if A[i] == mnv:
            mnv += 1
        else:
            return mnv
    return mnv
