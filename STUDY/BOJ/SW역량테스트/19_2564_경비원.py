# 펼쳐서 선분으로 생각 // 북 남 서 동
def distance(D, L):
    if D == 1:
        return L
    if D == 2:
        return W + H + W - L
    if D == 3:
        return W + H + W + H - L
    if D == 4:
        return W + L


# 입력
# 가로, 세로 입력
W, H = map(int, input().split())
# 상점 개수
N = int(input())

# 구현
route = []
for i in range(N + 1):
    D, L = map(int, input().split())
    route.append(distance(D, L))

answer = 0

for i in range(N):
    right_way = abs(route[-1] - route[i])
    left_way = 2 * (W + H) - right_way
    answer += min(right_way, left_way)

# 출력
print(answer)
