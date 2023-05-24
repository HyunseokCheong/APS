#include <bits/stdc++.h>
using namespace std;

/**
 * @Author HyunseokCheong
 * @Date 2023/01/24
 */
static long long A, B;
static long long answer;
static long long temp, cnt, i;

static long long solve(long long X) {
    cnt = 0;
    i = 1;
    while (X > 0) {
        if (X % 2 == 0) {
            temp = X / 2;
        } else {
            temp = X / 2 + 1;
        }
        cnt += temp * i;
        X -= temp;
        i *= 2;
    }
    return cnt;
}

int main() {
    // read
    cin >> A >> B;

    // solve
    answer = solve(B) - solve(A - 1);

    // write
    cout << answer << endl;
    return 0;
}