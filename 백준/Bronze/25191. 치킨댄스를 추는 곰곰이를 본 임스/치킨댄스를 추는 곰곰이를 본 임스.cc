#include <bits/stdc++.h>
using namespace std;

static int n; // 치킨
static int a, b; // 콜라, 맥주
static int answer;

int main() {
    cin >> n >> a >> b;
    
    answer = min((a / 2) + b , n);
    
    cout << answer << endl;
    return 0;
}
