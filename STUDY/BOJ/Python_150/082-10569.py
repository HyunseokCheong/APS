T = int(input())
for tc in range(T):
    V, E = map(int, input().split())
    answer = 2 - V + E
    print(answer)