H, W = map(int, input().split())
world = list(map(int, input().split()))

ans = 0
for i in range(1, W - 1):
    left_max = max(world[:i])
    right_max = max(world[i + 1:])

    temp = min(left_max, right_max)

    if world[i] < temp:
        ans += temp - world[i]
print(ans)