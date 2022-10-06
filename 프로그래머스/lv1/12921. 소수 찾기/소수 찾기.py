def solution(n):
    ans = 0
    arr = [False, False] + [True] * (n - 1)
    for i in range(2, n + 1):
        if arr[i]:
            ans += 1
            for j in range(2 * i, n + 1, i):
                arr[j] = False
    return ans
