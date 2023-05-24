#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N;
    vector<int> prime;
    cin >> N;

    bool arr[N + 1];
    fill(arr, arr + N + 1, true);
    arr[0] = false;
    arr[1] = false;
    for (int i = 2; i < N + 1; i++) {
        if (arr[i]) {
            prime.push_back(i);
            for (int j = i * 2; j < N + 1; j += i) {
                arr[j] = false;
            }
        }
    }

    int count = 0;
    int start = 0;
    int end = 0;

    while (end < prime.size()) {
        int temp = 0;
        for (int i = start; i <= end; i++) {
            temp += prime[i];
        }

        if (temp == N) {
            count++;
            end++;
        } else if (temp < N) {
            end++;
        } else if (temp > N) {
            start++;
        }
    }

    cout << count << "\n";
    return 0;
}