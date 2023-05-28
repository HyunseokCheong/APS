def isprime(x):
    if x == 1:
        return False
    for i in range(2, int(x ** 0.5) + 1):
        if x % i == 0:
            return False
    else:
        return True


n = int(input())
for j in range(n):
    num = int(input())
    left = right = num // 2

    while True:
        if left == 0 or right == num:
            break
        else:
            if isprime(left) and isprime(right):
                print(left, right)
                break
            else:
                left -= 1
                right += 1
