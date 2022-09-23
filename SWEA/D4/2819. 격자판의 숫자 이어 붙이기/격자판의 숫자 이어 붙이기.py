# 상 하 좌 우
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]


def dfs(x, y, s):
    # 종료
    if len(s) == 7:
        # 중복 체크
        if s not in result:
            result.append(s)
        return
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < 4 and 0 <= ny < 4:
            dfs(nx, ny, s + mat[nx][ny])


# 입력
t = int(input())
for tc in range(t):
    mat = [list(input().split()) for _ in range(4)]

    result = []

    # 4X4 탐색
    for j in range(4):
        for k in range(4):
            dfs(j, k, mat[j][k])
    print(f'#{tc + 1} {len(result)}')
