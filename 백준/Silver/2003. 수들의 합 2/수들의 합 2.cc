#include <iostream>
using namespace std;

int N, M, A[10001];

int solve() {
    int start = 0;
    int end   = 0;
    int sum   = 0;
    int count = 0;
    
    while (end <= N) {
        if (sum < M) {
            sum += A[end];
            end++;
        }
        if (sum == M) {
            count++;
            sum -= A[start];
            start++;
        }
        if (sum > M) {
            sum -= A[start];
            start++;
        }
    }
    
    return count;
}

int main() {
    cin >> N >> M;
    
    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }
    cout << solve() << "\n";
    return 0;
}