for tc in range(int(input())):
    N = int(input())
    way = [0] * 201
    for i in range(N):
        X, Y = map(int, input().split())
        if X <= Y:
            start = (X - 1) // 2
            end = (Y - 1) // 2
        else:
            start = (Y - 1) // 2
            end = (X - 1) // 2
        for j in range(start, end + 1):
            way[j] += 1
    max_value = 0
    for value in way:
        if value > max_value:
            max_value = value
    print(f'#{tc + 1} {max_value}')