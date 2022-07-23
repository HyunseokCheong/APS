dworfs = []  # 귀여운 난쟁이들을 리스트에 다 넣어 버릴 준비

for i in range(9):  # 9줄로 나눠서 입력 받고 입력 받을 때 마다 리스트에 난쟁이들을(키) 넣는다.
    key = int(input())
    dworfs.append(key)
dworfs.sort()  # 정렬

for i in dworfs:  # 2중 for문으로 가짜 난쟁이를 찾는다.
    for j in dworfs:
        if i == j:
            continue
        # 일곱 난쟁이의 키의 합이 100이라는 점을 이용해서 가짜 난쟁이를 찾고 리스트에서 제거한다.
        elif sum(dworfs) - 100 == i + j:
            dworfs.remove(i)
            dworfs.remove(j)
print(*dworfs, sep='\n')
