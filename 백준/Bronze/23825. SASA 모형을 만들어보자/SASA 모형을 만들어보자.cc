#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int S, A;
    cin >> S >> A;
    cout << min(S, A) / 2 << "\n";
    return 0;
}