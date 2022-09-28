def solution(seoul):
    ans = ''
    for idx in range(len(seoul)):
        if seoul[idx] == 'Kim':
            ans = f'김서방은 {idx}에 있다'
    return ans
