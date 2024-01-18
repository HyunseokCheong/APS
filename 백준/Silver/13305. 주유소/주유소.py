import sys

input = sys.stdin.readline


def find_min_cost_and_index(_pre_index: int):
    """
    이전에 탐색했던 인덱스보다 왼쪽의 주유소를 대상으로 탐색
    가장 저렴한 기름 가격과 주유소의 인덱스를 반환한다.
    같은 가격이 여러 개인 경우 가장 왼쪽 인덱스를 반환한다.

    :return:
    """
    _min_cost = 1000000000
    _min_cost_index = 100000
    for i in range(0, _pre_index):
        cost = oil[i]
        if cost < _min_cost:
            _min_cost = cost
            _min_cost_index = i
    return _min_cost, _min_cost_index


if __name__ == "__main__":
    """
    아이디어 :
    도착지에서 출발지로 역순으로 탐색하며 가장 싼 주유소를 찾는다. (2 <= n <=100,000)
    찾은곳이 출발지면 종료하고 출발지가 아니면 왼쪽 방향으로 그 다음으로 싼 주유소를 찾는다.
    반복 후 출발지에 도착하면 종료
    """

    n = int(input())
    road = list(map(int, input().split()))
    oil = list(map(int, input().split()))

    sum_of_oil = 0
    min_cost_index = n - 1
    while True:
        # 출발지에 도착하면 종료
        if min_cost_index == 0:
            break
        
        # 전에 어디까지 탐색했는지 초기화
        pre_index = min_cost_index
        # 가장 싼 주유소를 찾는다.
        min_cost, min_cost_index = find_min_cost_and_index(min_cost_index)
        # 가장 싼 주유소부터 전에 탐색했던 곳까지의 거리에 기름 가격을 적용
        sum_of_oil += min_cost * sum(road[min_cost_index:pre_index])
    
    print(sum_of_oil)