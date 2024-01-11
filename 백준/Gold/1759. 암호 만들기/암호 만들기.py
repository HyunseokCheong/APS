from collections import deque


def is_ok(password: str) -> bool:
    # 3 글자 이상
    if len(password) < 3:
        return False

    # 모음 1개, 자음 2개 이상
    vowel = {'a', 'e', 'i', 'o', 'u'}
    vowel_cnt = 0
    for p in password:
        if p in vowel:
            vowel_cnt += 1
    if vowel_cnt < 1 or len(password) - vowel_cnt < 2:
        return False

    # 오름차순
    for i in range(len(password) - 1):
        if password[i] > password[i + 1]:
            return False

    # 모든 조건 만족
    return True


def bfs():
    queue = deque()
    queue.append(["", 0])  # password, index

    while queue:
        cur_value = queue.popleft()
        password = cur_value[0]
        start_idx = cur_value[1]

        if len(password) == l and is_ok(password):
            print(password)
            continue

        for i in range(start_idx, c):
            next_password = password + data[i]
            next_idx = i + 1
            queue.append([next_password, next_idx])


l, c = map(int, input().split())
data = sorted(list(input().split()))
bfs()