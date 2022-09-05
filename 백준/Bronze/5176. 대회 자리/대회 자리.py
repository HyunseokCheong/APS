for tc in range(int(input())):
    P, M = map(int, input().split())
    seat = set()
    for i in range(P):
        want_seat = int(input())
        seat.add(want_seat)
    answer = P - len(seat)
    print(answer)
