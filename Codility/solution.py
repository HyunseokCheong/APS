def solution(A):
    # write your code in Python 3.6
    A.sort()
    for i in range(0, len(A)-1, 2):
        if A[i] != A[i+1]:
            return A[i]
    return A[-1]

print(solution([9, 3, 9, 3, 9, 7, 9]))