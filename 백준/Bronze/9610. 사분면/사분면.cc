#include <bits/stdc++.h>
using namespace std;

static int n;
static int q1, q2, q3, q4, axis;
static int x, y;

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> x >> y;
        if (x == 0 || y == 0) {
            axis++;
        } else if (x > 0) {
            if (y > 0) {
                q1++;
            } else{
                q4++;
            }
        } else if (x < 0) {
            if (y >0) {
                q2++;
            } else {
                q3++;
            }
        }
    }
    cout << "Q1: " << q1 << endl;
    cout << "Q2: " << q2<< endl;
    cout << "Q3: " << q3<< endl;
    cout << "Q4: " << q4<< endl;
    cout << "AXIS: " << axis<< endl;
}
