def solution(s):
    ans = []
    s = list(s)
    for i in s:
        if s.count(i) == 1:
            ans.append(i)
    ans.sort()
    return ''.join(ans)
