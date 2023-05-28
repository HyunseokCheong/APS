#include <bits/stdc++.h>

using namespace std;

int main() {
    int k, d, a;
    char skip;
    cin >> k >> skip >> d >> skip >> a;

    if (k + a < d || d == 0) cout << "hasu" << endl;
    else cout << "gosu" << endl;
}