import sys

sys.stdin = open('Algo2_대전_1반_정현석.txt')
'''
1
1
1
1 1 1
1 1 1
1 1 1

배열이 패턴보다 작은경우 체크
'''
T = int(input())  # 테스트 케이스 입력
for tc in range(T):
    N = int(input())
    board = [list(map(int, input().split())) for _ in range(N)]  # 2차원 배열 입력
    target = [list(map(int, input().split())) for _ in range(3)]  # 비교할 목표 2차원 배열 입력

    cnt = 0  # 동일한 패턴이 몇개인지 저장할 변수 생성

    for i in range(0, N - 2):  # 2차원 배열안에서
        for j in range(0, N - 2):
            temp = []
            for k in range(i, i + 3):  # 타겟과 같은 범위를 전부 탐색하고
                temp_row_list = []
                for l in range(j, j + 3):
                    temp_row_list.append(board[k][l])  # 임시 배열에 비교를 위해 저장한다.
                temp.append(temp_row_list)
            if temp == target:  # 저장한 임시 배열이 목표 배열과 일치한다면
                cnt += 1  # 동일한 패턴으로 판단하고 출력할 변수에 +1 해준다.

    print(f'#{tc + 1} {cnt}')  # 정답 출력
