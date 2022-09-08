'''
여2 남1
인턴쉽 참여 => 대회 X
만들 수 있는 최대의 팀
여학생: 0 ≤ N ≤ 100
남학생: 0 ≤ M ≤ 100
인턴쉽: 0 ≤ K ≤ M+N
'''
N, M, K = map(int, input().split())

team = 0
while N >= 2 and M >= 1 and M + N >= K + 3:
    N -= 2
    M -= 1
    team += 1
print(team)
