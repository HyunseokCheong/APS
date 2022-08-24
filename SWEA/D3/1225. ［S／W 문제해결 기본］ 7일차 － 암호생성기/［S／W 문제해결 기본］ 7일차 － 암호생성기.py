for tc in range(10):
    N = int(input())
    nums = list(map(int, input().split()))

    Qsize = 9
    Q = [0] * Qsize
    front = rear = 0

    def enqueue(item):
        global rear
        rear = (rear + 1) % Qsize
        Q[rear] = item
    def dequeue():
        global front
        front = (front + 1) % Qsize
        return Q[front]

    for val in nums:
        enqueue(val)

    cnt = 1
    while Q[rear]:
        val = dequeue()
        val -= cnt
        cnt = 1 if cnt == 5 else cnt + 1
        val = 0 if val < 0 else val
        enqueue(val)

    print(f'#{tc + 1}', end=' ')
    for i in range(8):
        print(dequeue(), end=' ')
    print()