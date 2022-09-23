t = int(input())
for tc in range(t):
    n = int(input())
    arr = sorted(list(map(int, input().split())))
    print(f'#{tc + 1}', *arr)