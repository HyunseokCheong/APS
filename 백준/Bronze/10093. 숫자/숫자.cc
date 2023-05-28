#include <iostream>
#define endl "\n"

using namespace std;

int main()
{
	long long a, b;
	cin >> a >> b;

	if (a > b)
	{
		swap(a, b);
	}

	if (a != b)
	{
		cout << b - a - 1 << endl;
		for (long long i = a + 1; i < b; i++)
		{
			cout << i << " ";
		}
	}
	else
	{
		cout << 0;
	}

	cout << endl;
	return 0;
}