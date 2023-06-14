#include <iostream>

using namespace std;

int main() {
    int testCase;
    string input;
    cin >> testCase;
    for (int i = 0; i < testCase; i++) {
        cin >> input;
        int score = 0;
        for (char c: input) {
            score++;
            if (c == 'D') {
                score--;
                break;
            }
        }
        cout << score << endl;
    }
}