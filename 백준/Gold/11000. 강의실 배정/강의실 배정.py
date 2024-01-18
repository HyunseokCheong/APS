import heapq
import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    강의 시작, 종료 시간이 주어지고 필요한 최소 강의실 개수 반환
    """

    # 입력
    n = int(input())
    lectures = []
    for _ in range(n):
        start, end = map(int, input().split())
        lectures.append([start, end])

    # 시작 시간, 종료 시간 순으로 정렬
    lectures.sort(key=lambda x: (x[0], x[1]))

    # 종료 시간을 기준으로 최소 힙
    # 1. 현재 강의의 시작 시간이 힙의 최소 값(가장 먼저 끝나는 강의의 종료 시간)
    # 보다 크거나 같으면 힙에서 삭제
    # 2. 현재 강의의 종료 시간을 힙에 추가
    # 3. 힙의 길이가 필요한 강의실의 개수
    heap = []
    for start, end in lectures:
        if heap and heap[0] <= start:
            heapq.heappop(heap)
        heapq.heappush(heap, end)
    print(len(heap))