# 입력
N, K = map(int, input().split())
nums = list(map(int, input().split()))

# 구현
sum_temp_list = 0
for i in range(0, K):
    sum_temp_list += nums[i]
result = sum_temp_list

for i in range(K, N):
    sum_temp_list += nums[i] - nums[i - K]
    if result < sum_temp_list:
        result = sum_temp_list

# 출력
print(result)
