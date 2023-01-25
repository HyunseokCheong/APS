#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    int N;
    cin >> T;
    while (T-- > 0) {
        cin >> N;
        if (N % 2 == 0) {
            cout << N << " is even" << endl;
        } else {
            cout << N << " is odd" << endl;
        }
    }
    return 0;
}