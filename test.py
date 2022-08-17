import sys

input = sys.stdin.readline
N, H = map(int, input().split())

# 동굴, 석순, 종유석 설치
cave = [0] * H
for i in range(N):
    if i % 2 == 0:
        cave[H - int(input())] += 1
    else:
        cave[0] += 1
        cave[int(input())] -= 1

# 누적합
for i in range(1, H):
    cave[i] += cave[i - 1]

# 최소값, 최소값 개수
print(min(cave), cave.count(min(cave)))