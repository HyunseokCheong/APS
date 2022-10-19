#include <bits/stdc++.h>

using namespace std;

int main() {
    int a, b, c, n, answer = 0;

    cin >> a >> b >> c >> n;

    for (int i = 0; i < n / c + 1; ++i) {
        for (int j = 0; j < n / b + 1; ++j) {
            for (int k = 0; k < n / a + 1; ++k) {
                if (i * c + j * b + k * a == n) {
                    answer = 1;
                }
            }
        }
    }
    cout << answer << '\n';
    return 0;
}