def gcd(num1, num2):
    while num2 > 0:
        num1, num2 = num2, num1 % num2
    return num1


n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    ans = (a * b) // gcd(a, b)
    print(ans)
