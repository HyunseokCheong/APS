from collections import deque


def bfs(n: int) -> int:
    count = 0

    queue = deque()
    queue.append(0)
    while queue:
        cur_value = queue.popleft()

        if cur_value == n:
            count += 1
            continue

        for next_value in range(cur_value + 1, cur_value + 4):
            if next_value <= n:
                queue.append(next_value)

    return count


t = int(input())

for _ in range(t):
    print(bfs(int(input())))