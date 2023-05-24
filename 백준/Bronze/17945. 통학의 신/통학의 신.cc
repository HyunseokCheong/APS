#include <bits/stdc++.h>
using namespace std;

int main() {
    int A, B;
    cin >> A >> B;
    
    for (int x = -1000; x < 1001; x++) {
        if((x * x) + (2 * A * x) + B == 0) {
            cout << x << " ";
        }
    }
    return 0;
}