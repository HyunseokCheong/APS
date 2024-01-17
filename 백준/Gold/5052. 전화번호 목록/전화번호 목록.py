import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    1 <= t <=50
    1 <= n <= 10,000
    len(phone_number) <= 10
    phone_number is unique
    """

    t = int(input().rstrip())
    for _ in range(t):
        n = int(input().rstrip())
        arr = [""] * n
        for i in range(n):
            arr[i] = input().rstrip()

        arr.sort()

        # ["119", "119119", ...]
        # "119" == "119119"[:3]
        # "119" == "119"
        for i in range(n - 1):
            if arr[i] == arr[i + 1][:len(arr[i])]:
                print("NO")
                break
        else:
            print("YES")