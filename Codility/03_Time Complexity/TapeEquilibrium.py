def solution(A):
    a = 0
    b = sum(A)
    mnv = 1e9
    for i in range(len(A) - 1):
        a += A[i]
        b -= A[i]
        mnv = min(mnv, abs(a - b))
    return mnv
