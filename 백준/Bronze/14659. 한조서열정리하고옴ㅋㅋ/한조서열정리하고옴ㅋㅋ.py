N = int(input())
bong = list(map(int, input().split()))

kill_log = [0] * N
for i in range(0, N - 1):
    kill = 0
    for j in range(i + 1, N):
        if bong[i] > bong[j]:
            kill += 1
        else:
            break
    kill_log[i] = kill

print(max(kill_log))