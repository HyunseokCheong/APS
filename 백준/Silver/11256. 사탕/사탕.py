import sys

input = sys.stdin.readline

if __name__ == "__main__":
    test_cast = int(input())
    result = []
    for t in range(test_cast):
        j, n = map(int, input().split())
        count = 0
        sum = 0
        li = []
        for _ in range(n):
            r, c = map(int, input().split())
            li.append(r * c)
        li.sort(reverse=True)
        for i in li:
            sum += i
            count += 1
            if sum >= j:
                break
        result.append(count)
    for i in result:
        print(i)