import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    1 <= t <= 20
    1 <= n <= 100,000
    1 <= s1, s2 <= n (동점 없음)
    
    아이디어 : 서류 성적을 기준으로 정렬 후 면접 성적을 비교하면서 최소값을 갱신
    """

    t = int(input())
    for _ in range(t):
        n = int(input())
        arr = [list(map(int, input().split())) for _ in range(n)]

        # 첫 번째 성적을 기준으로 정렬
        arr.sort()

        # 서류 성적 1등은 무조건 합격
        cnt = 1

        # 서류 성적 1등의 면접 성적을 기준으로 최소값을 갱신하면서 합격자 수를 늘려준다.
        _min = arr[0][1]
        for i in range(1, n):
            if arr[i][1] < _min:
                _min = arr[i][1]
                cnt += 1
        
        print(cnt)