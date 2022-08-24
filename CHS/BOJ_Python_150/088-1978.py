def countPrime(li):
    prime = 0
    for i in li:
        cnt = 0
        if i > 1:
            for j in range(2, int(i ** 0.5) + 1):
                if i % j == 0:
                    cnt += 1
            if cnt == 0:
                prime += 1
    return prime


N = int(input())
nums = list(map(int, input().split()))
print(countPrime(nums))
