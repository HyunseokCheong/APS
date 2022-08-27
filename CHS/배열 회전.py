N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]
list(zip(*arr[::-1]))
