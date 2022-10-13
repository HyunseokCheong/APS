def solution(box, n):
    arr = [0] * 3
    for i in range(3):
        arr[i] = box[i] // n
    return arr[0] * arr[1] * arr[2]
