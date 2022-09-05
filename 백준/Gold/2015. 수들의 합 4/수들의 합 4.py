N, K = map(int, input().split())
nums = list(map(int, input().split()))

sum_dict = {0: 1}
sum_val = 0
cnt = 0

for i in nums:
    sum_val += i
    if sum_val - K in sum_dict.keys():
        cnt += sum_dict[sum_val - K]
    if sum_val in sum_dict.keys():
        sum_dict[sum_val] += 1
    else:
        sum_dict[sum_val] = 1
print(cnt)