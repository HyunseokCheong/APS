def solution(start, end):
    answer = []
    
    for num in range(start, end - 1, -1):
        answer.append(num)
    
    return answer