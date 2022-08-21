for tc in range(int(input())):
    course = [0] * 5001

    for i in range(int(input())):
        A, B = map(int, input().split())
        for j in range(A, B + 1):
            course[j] += 1

    print(f'#{tc + 1}', end=' ')
    
    for i in range(int(input())):
        C = int(input())
        print(course[C], end=' ')
    print()