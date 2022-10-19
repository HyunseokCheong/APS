#include <bits/stdc++.h>

using namespace std;

int main() {
    int test_case;
    cin >> test_case;
    for (int i = 0; i < test_case; ++i) {
        int r;
        string s;
        cin >> r >> s;

        for (char j : s) {
            for (int k = 0; k < r; ++k) {
                cout << j;
            }
        }
        cout << "\n";
    }
}