N = int(input())
seat = set(map(int, input().split()))
print(N - len(seat))