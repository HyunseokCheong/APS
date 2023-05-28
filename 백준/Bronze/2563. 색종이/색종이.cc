#include <bits/stdc++.h>

using namespace std;

bool board[101][101];

int main() {
    int n, cnt = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int x, y;
        cin >> x >> y;
        for (int j = x; j < x + 10; j++) {
            for (int k = y; k < y + 10; k++) {
                if (!board[j][k]) {
                    board[j][k] = true;
                    cnt++;
                }
            }
        }
    }
    cout << cnt << '\n';
    return 0;
}
