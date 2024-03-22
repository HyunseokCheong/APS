def solution(s):
    arr = list(map(int, s.split()))
    mnv = arr[0]
    mxv = arr[0]
    for num in arr:
        mnv = min(mnv, num)
        mxv = max(mxv, num)
    return f'{mnv} {mxv}'