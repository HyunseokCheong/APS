#include <bits/stdc++.h>
using namespace std;
static int n; // 사람 수
static int maxPoint; // 최고 점수
static int point; // 회차 점수
static int d1, d2, d3; // 각 주사위 눈

int main() {
    cin >> n;
    
    maxPoint = 0;
    for (int i = 0; i < n; i++) { // 사람 수만큼 게임 플레이
        cin >> d1 >> d2 >> d3;
        if (d1 == d2 && d1 == d3) {
            point = 10000 + d1 * 1000;
        } else if (d1 == d2 || d1 == d3) {
            point = 1000 + d1 * 100;
        } else if (d2 == d3) {
            point = 1000 + d2 * 100;
        } else {
            point = max({d1, d2, d3}) * 100;
        }
        maxPoint = max(maxPoint, point);
    }
    cout << maxPoint << endl;
}
