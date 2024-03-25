def solution(my_string, n):
    answer = ''
    
    for data in my_string:
        for i in range(n):
            answer += data
    
    return answer