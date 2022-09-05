T = int(input())
for i in range(T):
    car = int(input())
    N = int(input())
    for j in range(N):
        q, p = map(int, input().split())
        car += q * p
    print(car)