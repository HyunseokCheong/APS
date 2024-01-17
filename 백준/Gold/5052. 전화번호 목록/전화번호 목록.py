if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        n = int(input())
        arr = [""] * n
        for i in range(n):
            arr[i] = input()
        arr.sort()
        for i in range(n - 1):
            if arr[i] == arr[i + 1][:len(arr[i])]:
                print("NO")
                break
        else:
            print("YES")