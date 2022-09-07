N, M = map(int, input().split())

noHearName = set()
for i in range(N):
    noHearName.add(input())

noSeeName = set()
for i in range(M):
    noSeeName.add(input())

dbj = sorted(list(noHearName & noSeeName))

print(len(dbj))

for i in dbj:
    print(i)
