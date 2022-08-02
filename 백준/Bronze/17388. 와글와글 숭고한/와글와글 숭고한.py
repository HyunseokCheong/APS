SKH = list(map(int, input().split()))
univ = ['Soongsil', 'Korea', 'Hanyang']
if sum(SKH) >= 100:
    print('OK')
else:
    print(univ[SKH.index(min(SKH))])