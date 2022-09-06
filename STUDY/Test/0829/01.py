import sys

sys.stdin = open('01.txt')
for tc in range(int(input())):
    N, min_K, max_K = map(int, input().split())
    score = list(map(int, input().split()))
    score.sort()

    minV = 1e9
    temp = True
    for i in range(0, N - 2):
        for j in range(i + 1, N - 1):
            A = score[0:i + 1]
            B = score[i + 1:j + 1]
            C = score[j + 1:N]
            min_temp = min(len(A), len(B), len(C))
            max_temp = max(len(A), len(B), len(C))
            if min_temp >= min_K and max_temp <= max_K and A[-1] != B[0] and B[-1] != C[0]:
                check = True
                if max_temp - min_temp < minV and check == True:
                    minV = max_temp - min_temp
    if minV == 1e9:
        minV = -1
    print(f'#{tc + 1} {minV}')
