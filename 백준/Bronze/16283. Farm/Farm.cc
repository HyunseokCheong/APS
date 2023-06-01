#include <bits/stdc++.h>
using namespace std;

int main() {
    int A, B, N, W;
    int count, X, Y;
    cin >> A >> B >> N >> W;
    
    count = 0;
    X = 0;
    Y = 0;
    for (int i = 1; i < N; i++) {
        if(A * i + B * (N - i) == W) {
            count++;
            X = i;
            Y = N - i;
        }
    }
    if (count == 0 || count >= 2) {
        cout << -1 << endl;
    } else {
        cout << X << " " << Y << endl;
    }
    return 0;
}