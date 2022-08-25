import sys

sys.stdin = open('01_회전.txt')
for tc in range(int(input())):
    N, M = map(int, input().split())
    nums = list(map(int, input().split()))

    Qsize = N + 1
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

    for i in range(N):
        enqueue(nums[i])

    for i in range(M):
        enqueue(dequeue())

    print(f'#{tc + 1} {dequeue()}')