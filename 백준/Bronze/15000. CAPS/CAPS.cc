#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    string input;
    cin >> input;
    for (int i = 0; i < input.size(); i++) {
        input[i] -= 32;
    }
    cout << input << "\n";
    return 0;
}