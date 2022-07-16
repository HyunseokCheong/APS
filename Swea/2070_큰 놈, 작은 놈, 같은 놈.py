T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    ans = ''
    if A > B:
        ans = '>'
    elif A == B:
        ans = '='
    else:
        ans = '<'
    print(f'#{i + 1} {ans}')
