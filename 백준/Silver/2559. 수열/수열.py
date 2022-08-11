# 문제 기본 입력
N, K = map(int, input().split())
tempList = list(map(int, input().split()))

# 누적합 리스트 생성
sumTempList = sum(tempList[:K])
result = sumTempList
for i in range(K, N):
    sumTempList += tempList[i] - tempList[i - K]
    result = max(result, sumTempList)

# 문제 풀이
print(result)