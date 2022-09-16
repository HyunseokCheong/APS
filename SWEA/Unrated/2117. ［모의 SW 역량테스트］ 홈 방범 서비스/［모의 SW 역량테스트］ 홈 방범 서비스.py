'''
비용(면적과 동일): K * K + (K - 1) * (K - 1)
1   2   3   4
1   5   13  25

도시크기
5 <= N <= 20

가구당 지불 비용
1 <= M <= 10
'''


# 마름모 크기에 따른 지출 비용
def cost(m):
    return m ** 2 + (m - 1) ** 2


for tc in range(int(input())):
    # 도시크기 N X N, 가구당 지불 비용 M
    N, M = map(int, input().split())
    city = [list(map(int, input().split())) for _ in range(N)]

    # 집이 있는 좌표 저장
    house = []
    for row in range(N):
        for col in range(N):
            if city[row][col] == 1:
                house.append([row, col])

    # 수익이 0인 경우도 포함
    max_profit = -1

    # 마름모 범위 반복
    for K in range(1, N + 2):
        # 전체 탐색
        for row in range(N):
            for col in range(N):
                cnt = 0

                # 집이 위치한 좌표를 현재 위치, 현재 마름모 크기를 기준으로
                # 기준에 적합한 집인지 검사
                for h in house:
                    r, c = h
                    if abs(row - r) + abs(col - c) < K:
                        cnt += 1

                # 현재 위치의 비용보다 수익이 더 크다면 최대 값 갱신
                if cost(K) <= cnt * M and max_profit < cnt:
                    max_profit = cnt

    print(f'#{tc + 1} {max_profit}')