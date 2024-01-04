from collections import deque

t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    number_arr = deque(list(map(int, input().split())))
    index_arr = deque([i for i in range(n)])

    cnt = 0
    while True:
        if number_arr[0] == max(number_arr):
            cnt += 1
            if index_arr[0] == m:
                print(cnt)
                break
            number_arr.popleft()
            index_arr.popleft()
        else:
            number_arr.append(number_arr.popleft())
            index_arr.append(index_arr.popleft())