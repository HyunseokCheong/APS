s = input()

cu_count = 0
dp_count = 0

for i in range(len(s)):
    cur = s[i]
    if cur == 'C' or cur == 'U':
        cu_count += 1
    elif cur == 'D' or cur == 'P':
        dp_count += 1

answer = ""

if cu_count > (dp_count + 1) // 2:
    answer += "U"

if dp_count > 0:
    answer += "DP"

print(answer)