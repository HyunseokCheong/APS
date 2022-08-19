for tc in range(int(input())):
    N = int(input())
    course = [0] * 5001

    for i in range(N):
        A, B = map(int, input().split())
        for j in range(A, B + 1):
            course[j] += 1

    print(f'#{tc + 1}', end=' ')

    P = int(input())
    for i in range(P):
        C = int(input())
        print(course[C], end=' ')
    print()