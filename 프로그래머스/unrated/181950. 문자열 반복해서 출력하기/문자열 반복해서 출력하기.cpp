#include <iostream>
#include <string>

using namespace std;

int main()
{
	string str, answer;
	int n;
	cin >> str >> n;
	answer = "";

	for (int i = 0; i < n; i++)
	{
		answer += str;
	}
	cout << answer << endl;
	return 0;
}