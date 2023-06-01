#include <bits/stdc++.h>
using namespace std;

static int testCase;
static int n; // 학교 수
static string college;
static int liquor;
static string maxCollege;
static int maxLiquor;

int main () {
    cin >> testCase;
    while (testCase-- > 0) {
        cin >> n;
        maxLiquor = 0;
        while (n-- > 0) {
            cin >> college >> liquor;
            if (liquor > maxLiquor) {
                maxCollege = college;
                maxLiquor = liquor;
            }
        }
        cout << maxCollege << endl;
    }
}
