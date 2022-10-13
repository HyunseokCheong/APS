#include <bits/stdc++.h>

using namespace std;

int main() {
    int dwf[10];
    int sum_val = 0;
    for (int i = 0; i < 9; ++i) {
        cin >> dwf[i];
        sum_val += dwf[i];
    }
    sort(dwf, dwf + 9);
    for (int i = 0; i < 8; ++i) {
        for (int j = 0; j < 9; ++j) {
            if (sum_val - (dwf[i] + dwf[j]) == 100) {
                for (int k = 0; k < 9; ++k) {
                    if (k != i && k != j) {
                        cout << dwf[k] << '\n';
                    }
                }
                return 0;
            }
        }
    }
    return 0;
}