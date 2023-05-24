#include <bits/stdc++.h>

using namespace std;

int main() {
    int x, y, a, b;
    cin >> x >> y;
    a = (x + y) / 2;
    b = (x - y) / 2;

    if ((x + y) % 2 != 0 || (x - y) % 2 != 0) {
        cout << -1 << endl;
    } else {
        if (a >= 0 && b >= 0) {
            if (a >= b) {
                cout << a << " " << b << endl;
            } else {
                cout << b << " " << a << endl;
            }
        } else {
            cout << -1 << endl;
        }
    }
}