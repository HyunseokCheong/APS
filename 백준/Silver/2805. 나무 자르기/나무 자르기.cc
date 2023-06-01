#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    long long n, m, max, start, end, mid, sum;
    cin >> n >> m;
    max = -1;
    
    int trees[n];
    
    for (int i = 0; i < n; i++) {
        cin >> trees[i];
    }
    sort(trees, trees + n);
    
    start = 0;
    end   = trees[n - 1];
    
    while (start <= end) {
        sum = 0;
        mid = (start + end) / 2;
        
        for (int i = 0; i < n; i++) {
            if (trees[i] - mid > 0) {
                sum += trees[i] - mid;
            }
        }
        
        if (sum >= m) {
            start = mid + 1;
            if (mid > max) {
                max = mid;
            }
        } else {
            end = mid - 1;
        }
    }
    
    cout << max << endl;
    return 0;
}