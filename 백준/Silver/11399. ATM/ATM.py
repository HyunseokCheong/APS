import sys

input = sys.stdin.readline

if __name__ == "__main__":
    """
    아이디어 : 오름차순으로 정렬한 것이 최소 시간일 것이다.
    이유 : 긴 시간이 앞으로 올 수록 그 긴 시간을 기다리는 인원이 많다.
    따라서 긴 시간을 뒤로 보내야 그 긴 시간을 기다리는 인원이 적어진다.
    """
    
    n = int(input())
    arr = sorted(list(map(int, input().split())))
    for i in range(1, n):
        arr[i] += arr[i - 1]
    print(sum(arr))