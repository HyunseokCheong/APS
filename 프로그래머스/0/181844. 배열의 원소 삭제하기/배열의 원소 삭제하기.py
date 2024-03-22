def solution(arr, delete_list):
    answer = []
    
    for num in arr:
        if not num in delete_list:
            answer.append(num)
    
    return answer