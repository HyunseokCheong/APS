#include <bits/stdc++.h>

using namespace std;

int main() {
    long long a, b, c, answer;
    cin >> a >> b >> c;

    if ((a + b) >= 2 * c) answer = a + b - (2 * c);
    else answer = a + b;

    cout << answer << endl;
}