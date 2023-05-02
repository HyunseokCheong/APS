#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
	int a, b, c;
	int score;
	cin >> a >> b >> c;

	if (a == b and b == c)
	{
		score = 10000 + a * 1000;
	}
	else if (a == b or a == c)
	{
		score = 1000 + a * 100;
	}
	else if (b == c)
	{
		score = 1000 + b * 100;
	}
	else
	{
		score = max({a, b, c}) * 100;
	}

	cout << score << endl;
	return 0;
}