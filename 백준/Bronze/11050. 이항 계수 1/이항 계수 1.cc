#include <bits/stdc++.h>

using namespace std;

int facto(int num) {
    int res = 1;
    for (int i = num; i > 0; i--) {
        res *= i;
    }
    return res;
}

int main() {
    int n, k, ans;
    cin >> n >> k;
    ans = facto(n) / (facto(n - k) * facto(k));
    cout << ans << "\n";
    return 0;
}