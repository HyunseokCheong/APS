#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int  countWin = 0;
    char resultPlay;
    int  answer   = 0;
    
    for (int i = 0; i < 6; i++) {
        cin >> resultPlay;
        if (resultPlay == 'W') {
            countWin++;
        }
    }
    
    if (countWin == 0) {
        answer = -1;
    } else if (countWin < 3) {
        answer = 3;
    } else if (countWin < 5) {
        answer = 2;
    } else {
        answer = 1;
    }
    
    cout << answer << "\n";
    return 0;
}