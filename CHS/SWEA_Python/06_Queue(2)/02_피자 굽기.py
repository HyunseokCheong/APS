def enqueue(item):
    global rear
    rear = (rear + 1) % Qsize
    Q[rear] = item


def dequeue():
    global front
    front = (front + 1) % Qsize
    return Q[front]
