A, B = map(int, input().split())

def calc(N):
    cnt = N
    i = 2
    while i <= N:
        cnt += (N // i) * (i // 2)
        i *= 2
    return cnt

print(calc(B) - calc(A - 1))