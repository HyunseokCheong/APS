'''
1 <= B, A <= 500
1 <= N <= 1000
'''
N = int(input())

cnt = 0
for B in range(1, 501):
    for A in range(B, 501):
        if B ** 2 + N == A ** 2:
            cnt += 1
print(cnt)