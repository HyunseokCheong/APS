def solution(n):
    answer = 0
    
    for data in str(n):
        answer += int(data)
        
    return answer