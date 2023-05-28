#include <iostream>
using namespace std;

int main() {
    int    N;
    int    length_of_input;
    string input;
    
    cin >> N;
    while (N-- > 0) {
        cin >> input;
        length_of_input = input.size();
        for (int i = 0; i < length_of_input; i++) {
            if (i == 0) {
                cout << input[i] << "";
            } else {
                if (input[i] == input[i - 1]) {
                    continue;
                } else {
                    cout << input[i] << "";
                }
            }
        }
        cout << "\n";
    }
    return 0;
}