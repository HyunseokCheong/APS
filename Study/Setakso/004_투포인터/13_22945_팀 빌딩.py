import sys
input = sys.stdin.readline

# 구간을 좁혀가야함
N = int(input())
stats = list(map(int, input().split()))

left = 0
right = N - 1
res = 0

while left < right:
    # 최대값 갱신
    res = max(res, (right - left - 1) * min(stats[left], stats[right]))
    # 개발자 수는 감소 + 포인터 중 더 작은 값을 움직여야 함
    if stats[left] < stats[right]:
        left += 1
    else:
        right -= 1
print(res)
