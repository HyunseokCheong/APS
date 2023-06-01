#include <bits/stdc++.h>
using namespace std;

int main() {
    int testCase, T, P;
    cin >> testCase;
    for (int i = 0; i < testCase; i++) {
        cin >> P >> T;
        P += T / 4;
        P -= T / 7;
        cout << P << "\n";
    }
    return 0;
}