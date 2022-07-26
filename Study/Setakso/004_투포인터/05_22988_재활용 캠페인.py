import sys
input = sys.stdin.readline

N, X = map(int, input().split())
C = list(map(int, input().split()))
C.sort()  # 정렬
res = 0  # 결과 값
res += C.count(X)  # 꽉찬 병 찾아서 리스트에서 빼고 결과 값에 더해줌
for i in range(res):
    C.pop()

S = 0  # 투포인터 시작
E = N - 1 - res  # 투포인터 끝 (꽉착 병 뺀거 반영)
cnt = N - res  # 남은 병

while S < E:
    if C[S] + C[E] >= X / 2:  # 2병 합친게 절반 이상이면
        res += 1  # 꽉찬 병 + 1
        cnt -= 2  # 쓰던 병 - 1
        S += 1  # 포인터 조절
        E -= 1
    else:
        S += 1  # 포인터 조절
print(res + cnt // 3)
# 무조건 3병을 가져가면 꽉찬 병 1병을 만들 수 있다.
# 이게 포인트였음 ㅠ
