def solution(s1, s2):
    answer = 0
    
    for a1 in s1:
        for a2 in s2:
            if a1 == a2:
                answer += 1
                
    return answer