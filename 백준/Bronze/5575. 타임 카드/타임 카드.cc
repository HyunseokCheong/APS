#include <bits/stdc++.h>

using namespace std;

int main() {
    int h, m, s, hh, mm, ss, hhh, mmm, sss;
    for (int i = 0; i < 3; i++) {
        cin >> h >> m >> s >> hh >> mm >> ss;
        hhh = hh - h;
        mmm = mm - m;
        sss = ss - s;
        if (sss < 0) {
            sss += 60;
            mmm--;
        }
        if (mmm < 0) {
            mmm += 60;
            hhh--;
        }
        cout << hhh << " " << mmm << " " << sss << endl;
    }
}