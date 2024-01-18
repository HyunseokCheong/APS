import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    n 개의 센서를 k 개의 구간으로 나누는 것
    
    1. 센서들의 위치 오름차순 정렬
    2. 센서들간의 거리를 내림차순 정렬
    3. 가장 먼 거리부터 k-1 개의 구간 제거
    """

    n = int(input())
    k = int(input())
    positions = sorted(list(map(int, input().split())))
    distances = sorted([positions[i] - positions[i - 1] for i in range(1, n)], reverse=True)
    result = sum(distances[k - 1:])
    print(result)