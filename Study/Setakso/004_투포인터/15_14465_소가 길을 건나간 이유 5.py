N, K, B = map(int, input().split())
signal = [] # 신호등 정보
for i in range(N + 1):
    signal.append(1)
result = 0 # 고장난 신호등 개수

for i in range(B): # 고장난 신호등 B
    temp = int(input())
    signal[temp] = 0
    if temp <= K:
        result += 1 # 개수 한개 추가

left = 1 # 시작 인덱스
right = K # 끝 인덱스
count = result
while True:
    if right >= N:
        break
    if not signal[left]:
        count -= 1
    left += 1
    right += 1
    if not signal[right]:
        count += 1
    if result > count:
        result = count
print(result)