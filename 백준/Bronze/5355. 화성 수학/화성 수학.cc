#include <bits/stdc++.h>

using namespace std;

int main() {
    int test_case;
    double num;
    string op;

    cin >> test_case;
    for (int i = 0; i < test_case; ++i) {
        cin >> num;
        getline(cin, op);
        for (auto c: op) {
            if (c == '@') num *= 3;
            if (c == '%') num += 5;
            if (c == '#') num -= 7;
        }

        printf("%.2f\n", num);
    }
}