def solution(hp):
    # 5 3 1
    answer = 0
    while hp != 0:
        if hp >= 5:
            hp -= 5
            answer += 1
            continue
        if hp >= 3:
            hp -= 3
            answer += 1
            continue
        if hp >= 1:
            hp -= 1
            answer += 1
    return answer