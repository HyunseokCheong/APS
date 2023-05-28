#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, m;
    string answer;
    cin >> n >> m;

    if (m == 1 || m == 2) answer = "NEWBIE!";
    else if (m <= n) answer = "OLDBIE!";
    else answer = "TLE!";

    cout << answer << endl;
}