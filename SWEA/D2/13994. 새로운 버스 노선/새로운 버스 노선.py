for tc in range(int(input())):
    bus_stop = [0] * 1001
    for i in range(int(input())):
        bus_type, start, end = map(int, input().split())

        if bus_type == 1:  # 일반
            for j in range(start, end + 1):
                bus_stop[j] += 1

        elif bus_type == 2:  # 급행
            for j in range(start, end + 1, 2):
                bus_stop[j] += 1

        elif bus_type == 3:  # 광역
            if start % 2 == 0:  # 짝수
                for j in range(start, end + 1):
                    if j % 4 == 0:
                        bus_stop[j] += 1
            else:  # 홀수
                for j in range(start, end + 1):
                    if j % 3 == 0 and j % 10 != 0:
                        bus_stop[j] += 1

    max_val = 0
    for i in bus_stop:
        if i > max_val:
            max_val = i
    print(f'#{tc + 1} {max_val}')