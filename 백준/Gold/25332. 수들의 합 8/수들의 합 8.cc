#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll A[200001], B[200001], pref[200001];
map<ll, ll> X;
#define for(i,n) for (int i=1;i<=n;i++)
 
int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for (i, n) cin >> A[i];
    for (i, n) cin >> B[i];
    // 누적합 만들기
    for (i, n) pref[i] = pref[i - 1] + B[i] - A[i];
    ll ans = 0;
    // pref[i-1]=pref[j]인 (i,j) 세기
    for (i, n) {
        if (pref[i] == 0) ans++; // i=1인 경우 pref[i]=0인걸 모두 세준다.(예외처리) 
        ans += X[pref[i]]++; // (... , i) 쌍 모두 세주고 갱신 
    }
    cout << ans << '\n';
}