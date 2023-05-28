#include <bits/stdc++.h>
using namespace std;

static int n;
static string input;
static int kbs1, kbs2;

int main() {
    cin >> n;
    
    // 인덱스 저장
    for (int i = 0; i < n; i++) {
        cin >> input;
        if (input == "KBS1") {
            kbs1 = i;
        } else if (input == "KBS2") {
            kbs2 = i;
        }
    }
    
    // 2보다 1이 밑에 있으면 1을 옮기는 중에 2의 위치가 한칸 밀림
    if (kbs1 > kbs2) {
        kbs2++;
    }
    
    // 1
    if (kbs1 != 0) {
        
        // 1 - 1 커서 이동
        for (int i = 0; i < kbs1; i++) {
            cout << '1';
        }
        
        // 1 - 4 채널 이동
        for (int i = 0; i < kbs1; i++) {
            cout << '4';
        }
    }
    
    // 2
    if (kbs2 != 1) {
        
        // 2 - 1 커서 이동
        for (int i = 0; i < kbs2; i++) {
            cout << '1';
        }
        
        // 2 - 4 채널 이동
        for (int i = 1; i < kbs2; i++) {
            cout << '4';
        }
    }
    return 0;
}
