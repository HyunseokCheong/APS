N = int(input())
if N == 0:
    print('divide by zero')
else:
    record = list(map(int, input().split()))
    answer = sum(record) / N / (sum(record) / N)
    print('%.2f' % answer)