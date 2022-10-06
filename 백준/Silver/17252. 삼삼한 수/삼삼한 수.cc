#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    if (n == 0) {
        cout << "NO" << "\n";
        return 0;
    }
    while (n) {
        if (n % 3 > 1) {
            cout << "NO" << "\n";
            return 0;
        }
        n /= 3;
    }
    cout << "YES" << "\n";
    return 0;
}
