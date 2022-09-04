T = int(input())
for i in range(T):
    N = int(input())
    store = list(map(int, input().split()))
    print(2 * (max(store) - min(store)))