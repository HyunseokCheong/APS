N = input()
N = sorted(N, reverse=True)
sum = 0

# N에 0이 없으면 -1 출력
if '0' not in N:
    print(-1)
else:
    for i in N:
        sum += int(i) # 각 자릿수를 sum에 더한다.
    if sum % 3 != 0: # 30의 배수가 아니면 -1 출력
        print(-1)
    else:
        print(''.join(N))

# 3의 배수는 자릿수를 전부 더해서 3의 배수
# 30의 배수는 자릿수를 전부 더해서 3의 배수 + 맨 끝 자리가 0