#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, m;
    string str;
    vector<string> vector;

    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> str;
        vector.push_back(str);
    }

    for (int i = 0; i < n; i++) {
        reverse(vector[i].begin(), vector[i].end());
        cout << vector[i] << "\n";
    }
}