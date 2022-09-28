def solution(arr):
    answer = []
    for idx in range(len(arr)):
        if idx == 0:
            answer.append(arr[idx])
        elif arr[idx] != arr[idx - 1]:
            answer.append(arr[idx])
    return answer
