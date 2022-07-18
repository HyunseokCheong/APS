def two_count(n):
    two = 0
    while n != 0:
        n = n // 2
        two += n
    return two

def five_count(n):
    five = 0
    while n != 0:
        n = n // 5
        five += n
    return five

N, M = map(int, input().split())

print(min(two_count(N) - two_count(N - M) - two_count(M), five_count(N) - five_count(N - M) - five_count(M)))