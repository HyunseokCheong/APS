def solution(citations):
    
    h = 0;
    for i in range(0, 10001):
        count = 0
        for data in citations:
            if data >= i:
                count += 1
        if count >= i:
            h = max(h, i)
        
    return h

