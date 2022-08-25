'''
N 큐에 넣을 요소 개수
Q 배열의 요소와 실제 Q의 요소는 다르다
Q[rear}, Q[front] 등으로 확인
'''
N = 10

Qsize = N + 1
Q = [0] * Qsize
front = rear = 0


def enqueue(item): # 큐의 맨 뒤에 요소 추가
    global rear
    rear = (rear + 1) % Qsize
    Q[rear] = item


def dequeue(): # 큐의 맨 앞 요소 삭제 및 반환
    global front
    front = (front + 1) % Qsize
    return Q[front]