#include <bits/stdc++.h>
using namespace std;

static int n; // 1 <= n <= 1000
static int k; // 1 <= k <= n
static int x; // 0 <= x <= 10000

int main() {
    cin >> n >> k;
    
    vector<int> arr;
    for (int i = 0; i < n; i++) {
        cin >> x;
        arr.push_back(x);
    }
    
    sort(arr.begin(), arr.end());
    cout << arr[n - k] << endl;
    return 0;
}
