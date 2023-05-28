#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int limitSpeed, yourSpeed, overSpeed, fine;
    cin >> limitSpeed >> yourSpeed;
    
    if (yourSpeed <= limitSpeed) {
        cout << "Congratulations, you are within the speed limit!" << "\n";
    } else {
        overSpeed = yourSpeed - limitSpeed;
        
        if (overSpeed <= 20) {
            cout << "You are speeding and your fine is $100." << "\n";
        } else if (overSpeed <= 30) {
            cout << "You are speeding and your fine is $270." << "\n";
        } else {
            cout << "You are speeding and your fine is $500." << "\n";
        }
    }
    return 0;
}