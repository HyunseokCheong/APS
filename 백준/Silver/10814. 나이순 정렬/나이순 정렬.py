import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    1 <= n <= 100,000
    1 <= age <= 200
    len(name) <= 100
    """
    n = int(input())
    arr = []
    for idx in range(n):
        age, name = input().split()
        arr.append([int(age), idx, name])

    arr.sort(key=lambda x: (x[0], x[1]))

    for age, idx, name in arr:
        print(age, name)