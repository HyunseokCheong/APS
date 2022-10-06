#include <bits/stdc++.h>

using namespace std;
int N, s[101], e[101], t[1001];

int main() {
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> s[i] >> e[i];
        for (int j = s[i]; j < e[i]; j++) t[j]++;
    }
    int ans = 0;
    for (int i = 0; i < N; i++) {
        for (int j = s[i]; j < e[i]; j++)
            t[j]--;
        int cnt = 0;
        for (int j = 0; j <= 1000; j++)
            if (t[j]) cnt++;
        ans = max(ans, cnt);
        for (int j = s[i]; j < e[i]; j++)
            t[j]++;
    }
    cout << ans << '\n';
    return 0;
}
