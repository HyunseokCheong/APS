#include <bits/stdc++.h>

using namespace std;

int main() {
    int H, M, C;
    cin >> H >> M >> C;

    int min = (M + C) % 60;
    int hour = (H + (M + C) / 60) % 24;

    cout << hour << " " << min;
    return 0;
}