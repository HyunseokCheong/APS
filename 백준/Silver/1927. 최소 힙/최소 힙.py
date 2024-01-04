import sys, heapq

input = sys.stdin.readline

hq = []
n = int(input())
for i in range(n):
    a = int(input())
    if a > 0:
        heapq.heappush(hq, a)
    elif a == 0 and not hq:
        print(0)
    elif a == 0 and hq:
        print(heapq.heappop(hq))