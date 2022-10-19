#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, sec, y = 0, m = 0;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> sec;
        y += (sec / 30 + 1) * 10;
        m += (sec / 60 + 1) * 15;
    }
    if (m < y) {
        cout << 'M' << ' ' << m;
    } else if (m > y) {
        cout << 'Y' << ' ' << y;
    } else {
        cout << 'Y' << ' ' << 'M' << ' ' << m;
    }
    return 0;
}