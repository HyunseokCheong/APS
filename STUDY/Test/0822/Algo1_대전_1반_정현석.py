import sys

sys.stdin = open('Algo1_대전_1반_정현석.txt')
T = int(input())  # 테스트 케이스 입력
for tc in range(T):
    N = int(input())
    r1, c1, r2, c2 = map(int, input().split())  # 평탄화 구역 좌측상단, 우측하단 좌표 입력
    board = [list(map(int, input().split())) for _ in range(N)]  # 마당을 2차 배열로 저장

    sum_val = 0  # 평탄화 구역의 높이를 저장할 변수 생성
    for i in range(r1, r2 + 1):  # 평탄화 구역의 좌표를 마당 배열에 적용하여 평탄화 구역의 높이 합 저장
        for j in range(c1, c2 + 1):
            sum_val += board[i][j]

    area = (r2 - r1 + 1) * (c2 - c1 + 1)  # 평탄화 구역의 면적을 좌표간 거리를 이용하여 계산
    target = sum_val // area  # 평탄화 구역의 높이 합을 평탄화 구역의 면적으로 나눈 값을 목표값으로 설정(소수점 이하 버림)

    answer = 0  # 계산 값 저장 변수 생성

    for i in range(r1, r2 + 1):  # 평탄화 구역의 높이와 목표 값의 차이를 계산 값 변수에 저장한다.
        for j in range(c1, c2 + 1):
            if board[i][j] > target:
                answer += board[i][j] - target
            elif board[i][j] < target:
                answer += target - board[i][j]

    print(f'#{tc + 1} {answer}')  # 정답 출력
