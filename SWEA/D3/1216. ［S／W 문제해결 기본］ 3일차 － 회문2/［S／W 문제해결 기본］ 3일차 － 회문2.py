def palindrom(li):
    return li == li[::-1]


def solve():
    cnt = 100
    while cnt >= 1:
        for m in range(100 - cnt + 1):
            for n in range(100 - cnt + 1):
                if palindrom(b1[m][n:n + cnt]):
                    return cnt
                if palindrom(b2[m][n:n + cnt]):
                    return cnt
        cnt -= 1


for _ in range(10):
    tc = int(input())
    b1 = [list(input()) for _ in range(100)]
    b2 = [[b1[i][j] for i in range(100)] for j in range(100)]
    answer = solve()
    print(f'#{tc} {answer}')