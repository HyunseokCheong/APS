import sys

sys.stdin = open('03_전기버스.txt')
for tc in range(int(input())):
    K, N, M = map(int, input().split())
    charge_station = [0] + list(map(int, input().split())) + [N]

    bus = 0
    cnt = 0

    for i in range(1, M + 2):
        if charge_station[i] - charge_station[i - 1] > K:
            cnt = 0
            break
        if bus + K < charge_station[i]:
            bus = charge_station[i - 1]
            cnt += 1

    print(f'#{tc + 1} {cnt}')