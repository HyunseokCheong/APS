def solution(n, m):
    answer = [0] * 2
    gcd = 0
    for i in range(1, 1000001):
        if i % n == 0 and i % m == 0:
            gcd = i
            break
    lcm = n * m / gcd
    answer[0], answer[1] = lcm, gcd
    return answer
