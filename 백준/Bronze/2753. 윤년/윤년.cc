#include <bits/stdc++.h>

using namespace std;

int main() {
    int y;
    int ans = 0;
    cin >> y;
    if ((y % 4 == 0 and y % 100 != 0) or (y % 400 == 0))
        ans = 1;
    cout << ans << '\n';
    return 0;
}