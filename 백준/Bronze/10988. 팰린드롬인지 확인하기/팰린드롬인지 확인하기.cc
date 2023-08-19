#include <iostream>
#include <string>
using namespace std;
int main()
{
	string input;
	int length_of_input;
	bool is_palindrome = true;
	cin >> input;
	length_of_input = input.length();

	for (int i = 0; i < length_of_input; i++) {
		char left = input[i];
		char right = input[length_of_input - i - 1];
		if (left != right) {
			is_palindrome = false;
			break;
		}
	}

	if (is_palindrome) {
		cout << 1 << endl;
	}
	else {
		cout << 0 << endl;
	}
}