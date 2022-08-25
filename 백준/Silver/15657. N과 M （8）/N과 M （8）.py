def BT():
    if len(arr) == M:
        print(*arr)
    else:
        for num in nums:
            if not arr:
                arr.append(num)
                BT()
                arr.pop()
            elif arr[-1] <= num:
                arr.append(num)
                BT()
                arr.pop()


N, M = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()

arr = []
BT()
