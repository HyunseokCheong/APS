#include <bits/stdc++.h>

using namespace std;

long long gcd(long x, long y) {
    while (y > 0) {
        x, y = y, x % y;
    }
    return x;
}

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; ++i) {
        long long a, b;
        cin >> a >> b;
        cout << (a * b) / gcd(a, b) << '\n';
    }
    return 0;
}