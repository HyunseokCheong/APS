#include <bits/stdc++.h>

using namespace std;

// 1 <= B <= A <= 500
// 1 <= N <= 1000
int main() {
  int n;
  int cnt = 0;
  cin >> n;

  for (int a = 1; a <= 500; a++) {
    for (int b = a; b <= 500; b++) {
      if (b * b == a * a + n)
        cnt++;
    }
  }
  cout << cnt << '\n';
}