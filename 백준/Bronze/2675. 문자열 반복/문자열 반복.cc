#include <bits/stdc++.h>

using namespace std;

int main() {
    int test_case;
    cin >> test_case;
    for (int i = 0; i < test_case; ++i) {
        int r;
        string s;
        cin >> r >> s;

        for (int j = 0; j < s.length(); ++j) {
            for (int k = 0; k < r; ++k) {
                cout << s[j];
            }
        }
        cout << "\n";
    }
}