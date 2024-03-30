def solution(num_str):
    answer = 0
    
    for data in num_str:
        answer += int(data)
        
    return answer