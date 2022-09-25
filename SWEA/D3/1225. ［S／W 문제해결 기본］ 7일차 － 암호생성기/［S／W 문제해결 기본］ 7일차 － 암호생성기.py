def enqueue(x):
    global rear
    rear = (rear + 1) % qsize
    q[rear] = x


def dequeue():
    global front
    front = (front + 1) % qsize
    return q[front]


for _ in range(10):
    tc = int(input())
    arr = list(map(int, input().split()))

    qsize = 9
    q = [0] * qsize
    front = rear = 0

    for val in arr:
        enqueue(val)

    cnt = 1
    while q[rear]:
        val = dequeue()
        val -= cnt
        if cnt == 5:
            cnt = 1
        else:
            cnt += 1
        if val < 0:
            val = 0
        else:
            val = val
        enqueue(val)

    print(f'#{tc}', end=' ')
    for i in range(8):
        print(dequeue(), end=' ')
    print()