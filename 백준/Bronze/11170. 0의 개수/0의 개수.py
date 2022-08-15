T = int(input())
for i in range(T):
    cnt = 0
    N, M = map(int, input().split())
    for j in range(N, M + 1):
        word = str(j)
        cnt += word.count('0')
    print(cnt)