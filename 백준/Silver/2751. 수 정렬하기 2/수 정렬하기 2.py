import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    1 <= n <= 1,000,000
    abs(ni) <= 1,000,000
    """
    n = int(input())
    arr = [0] * n
    for i in range(n):
        arr[i] = int(input())

    arr.sort()

    print(*arr, sep="\n")