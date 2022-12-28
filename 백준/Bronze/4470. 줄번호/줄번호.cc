#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    cin.ignore(); // 개행문자 무시
    for (int i = 1; i <= n; i++) {
        string name;
        getline(cin, name);
        cin.clear();
        cout << i << ". " << name << endl;
    }
}
