#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    int cnt = 0;
    cin >> n;
    for (int i = 1; i <= 100; ++i)
        for (int j = 1; j <= 100 - i; ++j)
            for (int k = 1; k <= 100 - i - j; ++k)
                if (i >= j + 2 && j != 0 && k != 0 && k % 2 == 0 && i + j + k == n)
                    cnt++;
    cout << cnt << '\n';
}
