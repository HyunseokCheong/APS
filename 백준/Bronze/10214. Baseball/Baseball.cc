#include <bits/stdc++.h>
using namespace std;

static int testCase;
static int yScore, kScore;
static int yTotalScore, kTotalScore;
static string winner;

int main () {
    cin >> testCase;
    while (testCase-- >0) {
        yTotalScore = 0;
        kTotalScore = 0;
        for (int i = 0; i < 9; i++) {
            cin >> yScore >> kScore;
            yTotalScore += yScore;
            kTotalScore += kScore;
        }
        if (yTotalScore > kTotalScore) {
            winner = "Yonsei";
        } else if (yTotalScore < kTotalScore) {
            winner = "Korea";
        } else {
            winner = "Draw";
        }
        cout << winner << endl;
    }
}
