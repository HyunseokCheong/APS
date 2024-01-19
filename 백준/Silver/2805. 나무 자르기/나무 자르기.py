import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    1 <= n <= 1,000,000
    1 <= m <= 2,000,000,000
    0 <= arr[i] <= 1,000,000,000
    """
    
    n, m = map(int, input().split())
    arr = list(map(int, input().split()))
    
    # 자를 높이의 범위 0 ~ 가장 긴 나무
    start, end = 0, max(arr)
    while start <= end:
        # 자를 높이 정함
        mid = (start + end) // 2
        
        # 나무 높이가 자를 높이보다 높다면 -> 잘림, 자른 나무 총합에 추가
        _sum = 0
        for tree in arr:
            if tree > mid:
                _sum += tree - mid
        
        # 자른 나무 총합이 목표보다 크거나 같다 -> 더 높은 위치로
        if _sum >= m:
            start = mid + 1
        # 더 낮은 위치로
        else:
            end = mid - 1

    print(end)