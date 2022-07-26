import sys
input = sys.stdin.readline

N, X = map(int, input().split())
C = list(map(int, input().split()))
res = 0  # 결과 값
# 두개를 합쳤을 때 절반은 넘으면서 최대한 절반에 가깝게 ?
# 총 용량 이상인거는 아예 빼버리자
left = 0
right = N - 1

#
while left != right:
    if C[right] >= X:
        print(left, right, res)
        res += 1
        right -= 1
    elif C[left] + C[right] >= N / 2:
        print(left, right, res)
        res += 1
        left += 1
        right -= 1
    elif C[left] + C[right] < N / 2:
        print(left, right, res)
        left += 1
print(res)
