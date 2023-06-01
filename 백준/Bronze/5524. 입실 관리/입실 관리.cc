#include <bits/stdc++.h>
using namespace std;

static int n;
static string input;

int main() {
    cin >> n;
    while (n-->0) {
        cin >> input;
        for (int i = 0; i < input.size(); i++) {
            if ('A' <= input[i] && input[i] <= 'Z') {
                input[i] += 32;
            }
        }
        cout << input << endl;
    }
    return 0;
}
