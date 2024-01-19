import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    3 <= n <= 10,000
    1 <= arr[i] <= 100,000
    n <= m <= 1,000,000,000

    1. 모든 요청이 배정될 수 있는 경우, 요청한 금액을 그대로 배정
    2. 모든 요청이 배정될 수 없는 경우, 정수 상한액을 정해
    상한액 이상의 요청은 상한액을 배정
    상한액 이하의 요청은 요청한 금액을 배정
    """
    
    n = int(input())
    arr = list(map(int, input().split()))
    m = int(input())

    # 정할 수 있는 상한액의 범위는 0 ~ max(arr)
    start, end = 0, max(arr)
    while start <= end:
        # 상한액 정함
        mid = (start + end) // 2

        # 정한 상한액의 조건에 따라 총 예산 산출
        _sum = 0
        for i in arr:
            if i > mid:
                _sum += mid
            else:
                _sum += i

        # 다음으로 정할 상한액 인덱스 조절
        if _sum <= m:
            start = mid + 1
        else:
            end = mid - 1

    print(end)