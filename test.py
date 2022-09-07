max_height = -1e9
max_height_idx = -1e9

N = int(input())
height = [int(input()) for _ in range(N)]

for idx in range(N - 1, -1, -1):
    if height[idx] > max_height:
        max_height = height[idx]
        max_height_idx = idx + 1
        height[idx] = 0
    else:
        height[idx] = max_height_idx

for idx in height:
    print(idx)