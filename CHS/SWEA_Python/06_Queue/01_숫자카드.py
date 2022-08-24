import sys

sys.stdin = open('01_숫자카드.txt')
for tc in range(int(input())):
    N = int(input())
    Q = [0] * 2000001
    front = rear = -1


    def enqueue(item):
        global rear
        rear += 1
        Q[rear] = item


    def dequeue():
        global front
        front += 1
        return Q[front]


    for i in range(1, N + 1):
        enqueue(i)

    while rear != front:
        temp = dequeue()
        if front % 2:
            enqueue(temp)

    print(f'#{tc + 1} {Q[front]}')
