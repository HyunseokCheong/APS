#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    // 1 ~ N 증가
    for (int i = 1; i <= N; i++) {
        for (int j = 0; j < i; j++) {
            cout << "*";
        }
        cout << endl;
    }
    
    // N - 1 ~ 1 감소
    for (int i = N - 1; i >= 1; i--) {
        for (int j = 0; j < i; j++) {
            cout << "*";
        }
        cout << endl;
    }
    return 0;
}