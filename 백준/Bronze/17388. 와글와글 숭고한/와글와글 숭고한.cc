#include <bits/stdc++.h>

using namespace std;

int main() {
    int s, k, h;
    cin >> s >> k >> h;

    if (s + k + h >= 100) {
        cout << "OK" << "\n";
        return 0;
    } else {
        if (s < k && s < h) {
            cout << "Soongsil" << "\n";
        } else if (k < s && k < h) {
            cout << "Korea" << "\n";
        } else {
            cout << "Hanyang" << "\n";
        }
    }
}