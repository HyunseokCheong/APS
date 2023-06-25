#include <iostream>

using namespace std;

string input;
int n;
int main()
{
	cin >> input;
	n = input.length();

	for (int i = 0; i < n; i++)
	{
		cout << input[i] << endl;
	}
	return 0;
}