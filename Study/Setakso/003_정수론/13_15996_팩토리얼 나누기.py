# N이하의 A의 배수의 갯수: N // A

N, A = map(int, input().split())
res = N // A  # A의 배수의 갯수
cnt = res
while res >= A:
    res //= A
    cnt += res
print(cnt)
