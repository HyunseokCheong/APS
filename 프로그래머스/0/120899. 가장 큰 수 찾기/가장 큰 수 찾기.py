def solution(array):
    max_num = 0
    max_idx = 0
    for i in range(len(array)):
        if array[i] > max_num:
            max_num = array[i]
            max_idx = i
    return [max_num, max_idx]
