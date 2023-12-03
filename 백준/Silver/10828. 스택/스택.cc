#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main(void) {
    int n, num;
    stack<int> stack;
    string str;
    
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> str;
        if (str == "push") {
            cin >> num;
            stack.push(num);
        }
        if (str == "pop") {
            if (stack.empty()) {
                cout << -1 << endl;
            } else {
                cout << stack.top() << endl;
                stack.pop();
            }
        }
        if (str == "size") {
            cout << stack.size() << endl;
        }
        if (str == "empty") {
            if (stack.empty()) {
                cout << 1 << endl;
            }
            if (!stack.empty()) {
                cout << 0 << endl;
            }
        }
        if (str == "top") {
            if (stack.empty()) {
                cout << -1 << endl;
            } else {
                cout << stack.top() << endl;
            }
        }
    }
    return 0;
}