import sys

sys.setrecursionlimit(2000)
input = sys.stdin.readline

if __name__ == "__main__":

    def recur(s: int, e: int, c: int) -> int:
        if s == e:
            return arr[s] * c
        if dp[s][e]:
            return dp[s][e]
        dp[s][e] = max(recur(s + 1, e, c + 1) + c * arr[s], recur(s, e - 1, c + 1) + c * arr[e])
        return dp[s][e]


    n = int(input())
    arr = [int(input()) for _ in range(n)]

    dp = [[0 for _ in range(n)] for _ in range(n)]
    print(recur(0, n - 1, 1))