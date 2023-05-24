#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int         N, input, X;
    int         left, right, sum, count;
    vector<int> V;
    
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> input;
        V.push_back(input);
    }
    cin >> X;
    sort(V.begin(), V.end());
    
    left  = 0;
    right = N - 1;
    sum   = 0;
    count = 0;
    
    while (true) {
        if (left >= right) {
            break;
        }
        
        sum = V[left] + V[right];
        if (sum == X) {
            count++;
            left++;
            right--;
        } else if (sum < X) {
            left++;
        } else if (sum > X) {
            right--;
        }
    }
    cout << count << "\n";
    return 0;
}