import sys

input = sys.stdin.readline

store = {}
n, m = map(int, input().split())
for i in range(n):
    address, password = input().split()
    store[address] = password
for i in range(m):
    print(store[input().rstrip()])