#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int A, B, C, D;
    cin >> A >> B >> C >> D;
    
    if (A == B && B == C && C == D) {
        cout << "Fish At Constant Depth" << "\n";
    } else if (A < B && B < C && C < D) {
        cout << "Fish Rising" << "\n";
    } else if (A > B && B > C && C > D) {
        cout << "Fish Diving" << "\n";
    } else {
        cout << "No Fish" << "\n";
    }
    return 0;
}