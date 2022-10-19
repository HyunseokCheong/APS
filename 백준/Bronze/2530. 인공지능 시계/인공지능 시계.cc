#include <bits/stdc++.h>

using namespace std;

int main() {
    int hour, minute, second, cook;
    cin >> hour >> minute >> second;
    cin >> cook;

    second += cook;
    minute += second / 60;
    hour += minute / 60;

    cout << hour % 24 << " " << minute % 60 << " " << second % 60;
    return 0;
}