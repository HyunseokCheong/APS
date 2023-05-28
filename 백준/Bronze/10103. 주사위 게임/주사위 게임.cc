#include <bits/stdc++.h>
using namespace std;

static int n; // 라운드 수
static int p1, p2; // 각 플레이어 점수
static int d1, d2; // 각 플레이어 주사위

int main() {
    cin >> n;
    p1 = 100;
    p2 = 100;
    while (n-- > 0) {
        cin >> d1 >> d2;
        if (d1 == d2) {
            continue;
        } else if (d1 > d2) {
            p2 -= d1;
        } else {
            p1 -= d2;
        }
    }
    cout << p1 << '\n' << p2 << '\n';
}
