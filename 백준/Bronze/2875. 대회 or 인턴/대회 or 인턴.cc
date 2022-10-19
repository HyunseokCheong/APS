#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, m, k; // 여학생, 남학생, 인턴
    cin >> n >> m >> k;

    int team = min(min(m, n / 2), (n + m - k) / 3);
    cout << team << '\n';
    return 0;
}