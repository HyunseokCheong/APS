/*
 얼 + 0 미만 => c초 당 1도 오름
 얼 + 0 => d초 동안 해동
 안얼 => e초당 1도 오름
 */
#include <bits/stdc++.h>
using namespace std;
static int a; // 고기 온도, -100 <= a <= 100, a != 0
static int b; // 목표 온도
static int c, d, e;
static bool frozen; // 얼어있는지 확인
static int answer;

int main() {
    cin >> a >> b >> c >> d >> e;
    
    answer = 0;
    if (a < 0) {
        frozen = true;
    } else {
        frozen = false;
    }
    
    while (a < b) {
        if (a < 0) {
            a++;
            answer += c;
        } else if (a == 0 && frozen == true) {
            frozen = false;
            answer += d;
        } else if (a >= 0) {
            a++;
            answer += e;
        }
    }
    cout << answer << endl;
    return 0;
}
