import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    1 <= n <= 500,000
    n % 2 == 1
    abs(arr[i]) <= 4,000
    """
    n = int(input())
    r1 = 0
    max_value = -4000
    min_value = 4000
    count = [0] * 8001
    max_count = 0

    for i in range(n):
        num = int(input())
        r1 += num
        count[num + 4000] += 1
        max_count = max(max_count, count[num + 4000])
        max_value = max(max_value, num)
        min_value = min(min_value, num)

    # 산술 평균
    r1 = round(r1 / n)

    # 중앙값
    r2 = 0
    cnt = 0
    for i in range(8001):
        if count[i] != 0:
            cnt += count[i]
            if cnt >= n // 2 + 1:
                r2 = i - 4000
                break

    # 최빈값
    r3_candidate = [i - 4000 for i, c in enumerate(count) if c == max_count]
    r3 = r3_candidate[0] if len(r3_candidate) == 1 else r3_candidate[1]

    # 범위
    r4 = max_value - min_value

    print(r1, r2, r3, r4, sep='\n')