#include <bits/stdc++.h>

using namespace std;

bool prime(int x) {
    if (x <= 1) {
        return false;
    }
    for (int i = 2; i < x; ++i) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int n, left, right, num;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> num;
        left = num / 2;
        right = num / 2;
        while (true) {
            if (left == 0 or right == num) {
                break;
            } else if ((prime(left) and prime(right))) {
                cout << left << ' ' << right << '\n';
                break;
            } else {
                left -= 1;
                right += 1;
            }
        }
    }
    return 0;
}