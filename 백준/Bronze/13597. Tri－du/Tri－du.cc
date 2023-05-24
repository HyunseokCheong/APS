#include <bits/stdc++.h>
using namespace std;

int main() {
    int A, B;
    int answer;

    cin >> A >> B;

    if (A == B) {
        answer = A;
    } else {
        answer = max(A, B);
    }

    cout << answer << "\n";
    return 0;
}