# G: 입력 값
# P: 현재 몸무게
# Q: 성원이가 기억하고 있던 몸무게
# left, right: 투포인터 변수
# ans: 결과 값(가능한 현재 몸무게를 담고 있는 리스트)

# 1. 1 ~ 100000 까지 현재 몸무게(P)와 성원이가 기억하고 있던 몸무게(Q)에 대한 리스트를 선언한다.
# 2. 투 포인터를 통해 값을 비교한다.
# 3. ans에 담긴 값을 출력한다.

G = int(input())
P = [i for i in range(1, 100001)]
Q = [i for i in range(1, 100001)]
N, M = 100000, 100000
left, right = 0, 0
ans = []

while left < N and right < M:
    temp = (P[left] + Q[right]) * (P[left] - Q[right])
    if temp == G:
        ans.append(P[left])
    if temp < G:
        left += 1
        continue
    right += 1

if len(ans) == 0:
    print(-1)
else:
    print(*ans)
