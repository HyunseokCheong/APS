#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, i = 2;
    cin >> n;
    if (n == 1) {
        cout << " " << '\n';
        return 0;
    } else {
        while (i * i <= n) {
            if (n % i == 0) {
                cout << i << '\n';
                n /= i;
            } else {
                i += 1;
            }
        }
    }
    cout << n << '\n';
    return 0;
}