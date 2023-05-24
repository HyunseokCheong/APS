#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int N, A, B, C;
    int answer = 0;
    cin >> N >> A >> B >> C;
    
    answer += min(N, A) + min(N, B) + min(N, C);
    cout << answer << "\n";
}