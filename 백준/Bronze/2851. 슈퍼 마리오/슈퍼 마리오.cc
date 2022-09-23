#include <bits/stdc++.h>

using namespace std;

int mush[10];
int score = 0;

void solve() {
    int sum = 0;
    for (int i = 0; i < 10; ++i) {
        sum += mush[i];
        if (abs(100 - score) >= abs(100 - sum)) {
            score = sum;
            if (score >= 100) {
                cout << score;
                return;
            }
        }
    }
    cout << score;
}

int main(void) {
    for (int i = 0; i < 10; ++i) {
        cin >> mush[i];
    }
    solve();
}