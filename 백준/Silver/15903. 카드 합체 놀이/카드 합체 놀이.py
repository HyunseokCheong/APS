import sys, heapq

input = sys.stdin.readline

n, m = map(int, input().split())
card_list = list(map(int, input().split()))

heapq.heapify(card_list)
for _ in range(m):
    num1 = heapq.heappop(card_list)
    num2 = heapq.heappop(card_list)
    heapq.heappush(card_list, num1 + num2)
    heapq.heappush(card_list, num1 + num2)

print(sum(card_list))