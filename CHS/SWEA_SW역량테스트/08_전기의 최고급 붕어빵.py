import sys

sys.stdin = open('08_전기의 최고급 붕어빵.txt')
for tc in range(int(input())):
    N, M, K = map(int, input().split())

    time = [0] * 11112
    fish_bread = 0
    guest = list(map(int, input().split()))
    for i in guest:
        time[i] -= 1

    answer = 'Possible'
    if time[0] < 0:
        answer = 'Impossible'
    else:
        for i in range(1, len(time)):
            if time[i] != 0:
                fish_bread += time[i]
            if i % M == 0:
                fish_bread += K
            if fish_bread < 0:
                answer = 'Impossible'
                break

    print(f'#{tc + 1} {answer}')
