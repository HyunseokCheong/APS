import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    1 <= n, m <= 50
    1 <= abs(arr[i]) <= 10,000
    """
    n, m = map(int, input().split())
    arr = list(map(int, input().split()))

    left = []
    right = []
    max_dist = 0
    for a in arr:
        if a < 0:
            left.append(a)
        else:
            right.append(a)
        max_dist = max(max_dist, abs(a))

    left.sort()
    right.sort(reverse=True)

    result = 0
    for i in range(0, len(left), m):
        if abs(left[i]) != max_dist:
            result += abs(left[i]) * 2
    for i in range(0, len(right), m):
        if right[i] != max_dist:
            result += abs(right[i]) * 2

    result += max_dist
    print(result)