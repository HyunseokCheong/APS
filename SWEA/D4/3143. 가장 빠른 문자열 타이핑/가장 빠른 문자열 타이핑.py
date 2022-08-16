def func():
    i = 0
    cnt = 0
    while i < len_A - len_B + 1:
        if A[i:i + len_B] == B:
            cnt += 1
            i += len_B
        else:
            cnt += 1
            i += 1
    while i < len_A:
        cnt += 1
        i += 1
    return cnt

for tc in range(int(input())):
    A, B = input().split()
    len_A = len(A)
    len_B = len(B)
    print(f'#{tc + 1} {func()}')