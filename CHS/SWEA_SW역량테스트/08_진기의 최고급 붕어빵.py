import sys

sys.stdin = open('08_진기의 최고급 붕어빵.txt')
for tc in range(int(input())):
    N, M, K = map(int, input().split())  # 손님 수, 제작 시간, 제작 개수

    time = [0] * 11112
    guest = list(map(int, input().split()))  # 손님 오는 시간
    for i in guest:
        time[i] -= 1

    fish_bread = 0
    answer = 'Possible'

    for i in range(0, len(time)):
        fish_bread += time[i]

        if i != 0 and i % M == 0:
            fish_bread += K

        if fish_bread < 0:
            answer = 'Impossible'
            break

    print(f'#{tc + 1} {answer}')
