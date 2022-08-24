T = int(input())
for i in range(T):
    N = int(input())
    max_coast = 0
    max_name = ''
    for j in range(N):
        coast, name = input().split()
        coast = int(coast)
        if max_coast < coast:
            max_name = name
            max_coast = coast
    print(max_name)