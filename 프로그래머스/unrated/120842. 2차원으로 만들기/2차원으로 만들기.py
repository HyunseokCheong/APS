def solution(num_list, n):
    arr = []
    for i in range(0, len(num_list), n):
        arr.append(num_list[i:i + n])
    return arr
