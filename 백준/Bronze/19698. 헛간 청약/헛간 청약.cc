#include <bits/stdc++.h>
using namespace std;

static int n ,w, h, l;
static int answer;

int main() {
    cin >> n >> w >> h >> l;
    
    answer = (w / l) * (h / l);
    if (answer > n) {
        answer = n;
    }
    
    cout << answer << endl;
    return 0;
}
