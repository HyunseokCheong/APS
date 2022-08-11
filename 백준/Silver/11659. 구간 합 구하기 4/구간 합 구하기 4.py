# 문제 기본 입력
N, M = map(int, input().split())
nums = list(map(int, input().split()))

# 누적합 리스트 생성
prefixList = [0]
temp = 0
for i in nums:
    temp += i
    prefixList.append(temp)

# 문제 풀이
for j in range(M):
    a, b = map(int, input().split())
    print(prefixList[b] - prefixList[a - 1])