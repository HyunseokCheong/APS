import sys

input = sys.stdin.readline

if __name__ == "__main__":
    n = int(input())
    arr = [0 for _ in range(100001)]
    for _ in range(n):
        pos, col = map(int, input().split())
        arr[pos] = col

    ans = 0
    for i in range(0, 100001):
        if arr[i] == 0:
            continue
        col = arr[i]
        min_dist = 100000
        for j in range(0, i):
            if arr[j] == col:
                min_dist = min(min_dist, i - j)
        for j in range(i + 1, 100001):
            if arr[j] == col:
                min_dist = min(min_dist, j - i)
        ans += min_dist
    print(ans)