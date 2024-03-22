def solution(rsp):
    win = {"0" : "5", "2" : "0", "5" : "2"}
    
    answer = ''
    
    for data in rsp:
        answer += win[data]
        
    return answer