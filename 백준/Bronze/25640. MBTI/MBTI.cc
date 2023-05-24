#include <iostream>

using namespace std;

int main() {
    string jinho, input;
    int N, answer = 0;
    cin >> jinho >> N;
    while (N-- > 0) {
        cin >> input;
        if (jinho == input) {
            answer++;
        }
    }
    cout << answer << "\n";
    return 0;
}