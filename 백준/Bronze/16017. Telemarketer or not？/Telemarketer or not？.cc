#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int A, B, C, D;
    cin >> A >> B >> C >> D;
    
    if (A == 8 || A == 9) {
        if (B == C) {
            if (D == 8 || D == 9) {
                cout << "ignore" << "\n";
                return 0;
            }
        }
    }
    
    cout << "answer" << "\n";
    return 0;
}