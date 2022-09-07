N, M = map(int, input().split())
A = list(map(int, input().split()))
left = 0 # 포인터1 위치 지정
right = 1 # 포인터2 위치 지정
cnt = 0 # 출력할 경우의 수 체크
while right <= N and left <= right: # 포인터1, 2 가동 범위 지정
    res = A[left:right] # 비교 값 = 포인터 사이 값
    tot = sum(res) # 비교 값의 합계, 이 값을 기준으로 포인터 움직일 거임
    if tot == M: # 포인터 사이 값의 합이 M과 일치함 -> 경우의 수 + 1, 포인터2 한칸 우측으로
        cnt += 1
        right += 1
    elif tot < M: # 포인터 사이 값의 합이 M보다 작음 -> 포인터2 한칸 우측으로
        right += 1
    elif tot > M:
        left += 1 # 포인터 사이 값의 합이 M보다 큼 -> 포인터1 한칸 우측으로
print(cnt)
