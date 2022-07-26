n = int(input())

is_prime = [False, False] + [True] * (n-1)
prime_num = []

for i in range(2, n+1):
    if is_prime[i]:
        prime_num.append(i)
        for j in range(2*i, n+1, i):
            is_prime[j] = False

result = 0
start = 0
end = 0

while end <= len(prime_num):
    temp = sum(prime_num[start:end])
    if temp == n:
        result += 1
        end += 1
    elif temp < n:
        end += 1
    else:
        start += 1

print(result)
