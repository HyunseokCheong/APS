#include <bits/stdc++.h>
using namespace std;

static int n;
static int arr[100000]; // 2 <= n <= 100000
static int answer;

int main() {
    // read
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    
    //solve
    answer = abs(arr[1] - arr[0]);
    for (int i = 0; i < n - 1; i++) {
        answer = min(answer, abs(arr[i + 1] - arr[i]));
    }
    
    // write
    cout << answer << endl;
}
