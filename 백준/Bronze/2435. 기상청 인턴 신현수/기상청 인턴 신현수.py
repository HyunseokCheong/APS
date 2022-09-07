N, K = map(int, input().split())
temp = list(map(int, input().split()))

PFS = []
for i in range(0, N - K + 1):
    PFS.append(sum(temp[i:i + K]))
print(max(PFS))