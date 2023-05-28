#include <bits/stdc++.h>

using namespace std;

int main() {
    string input;
    int a, b, answer;
    cin >> input;

    // 4
    if (input.length() == 4) {
        a = 10;
        b = 10;
    }
    // 3
    if (input.length() == 3) {
        if (input[1] == '0') {
            a = 10;
            b = input[2] - '0';
        } else {
            a = input[0] - '0';
            b = 10;
        }
    }

    // 2
    if (input.length() == 2) {
        a = input[0] - '0';
        b = input[1] - '0';
    }

    answer = a + b;
    cout << answer << endl;
}
