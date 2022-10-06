#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        for (int j = 2; j < num + 1; j++) {
            int cnt = 0;
            if (num % j == 0) {
                while (num % j == 0) {
                    num /= j;
                    cnt += 1;
                }
                cout << j << ' ' << cnt << '\n';
            } else if (num == 1) {
                break;
            }
        }
    }
    return 0;
}