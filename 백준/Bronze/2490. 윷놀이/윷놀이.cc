#include <bits/stdc++.h>

using namespace std;

int main() {
    for (int i = 0; i < 3; i++) {
        int a, b, c, d, res;
        char ans;
        cin >> a >> b >> c >> d;
        res = a + b + c + d;
        if (res == 0) {
            ans = 'D';
        } else if (res == 1) {
            ans = 'C';
        } else if (res == 2) {
            ans = 'B';
        } else if (res == 3) {
            ans = 'A';
        } else {
            ans = 'E';
        }
        cout << ans << '\n';
    }
    return 0;
}