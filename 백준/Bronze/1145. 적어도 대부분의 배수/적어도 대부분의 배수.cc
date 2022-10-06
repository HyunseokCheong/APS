#include <bits/stdc++.h>

using namespace std;
int nums[5];
int answer = 1;

int solve(int n) {
    int cnt = 0;
    for (int i = 0; i < 5; ++i) {
        if (n % nums[i] == 0) {
            cnt++;
        }
    }
    return cnt;
}

int main() {
    for (int i = 0; i < 5; ++i) {
        cin >> nums[i];
    }
    while (solve(answer) < 3) {
        answer++;
    }
    cout << answer << '\n';
    return 0;
}