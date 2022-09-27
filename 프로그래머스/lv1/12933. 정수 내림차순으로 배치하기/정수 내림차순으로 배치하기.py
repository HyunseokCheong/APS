def solution(n):
    res = []
    for i in str(n):
        res.append(int(i))
    res.sort(reverse=True)
    return int(''.join(map(str, res)))
