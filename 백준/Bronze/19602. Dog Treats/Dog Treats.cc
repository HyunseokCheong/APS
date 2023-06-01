#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    int S, M, L, answer;
    string output;
    cin >> S >> M >> L;

    answer = S + M * 2 + L * 3;
    if (answer >= 10) {
        output = "happy";
    } else {
        output = "sad";
    }

    cout << output << "\n";
    return 0;
}