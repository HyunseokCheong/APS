#include <bits/stdc++.h>

using namespace std;

int main() {
    int a, b, c, ans = 0;
    cin >> a >> b >> c;
    if (a == b and b == c) {
        ans = a * 1000 + 10000;
    } else if (a == b or a == c) {
        ans = a * 100 + 1000;
    } else if (b == c) {
        ans = b * 100 + 1000;
    } else {
        ans = max({a, b, c}) * 100;
    }
    cout << ans << '\n';
    return 0;
}