#include <iostream>
using namespace std;

int main()
{
	int n;
	int time;
	int ySum = 0;
	int mSum = 0;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> time;
		ySum += (time / 30 + 1) * 10;
		mSum += (time / 60 + 1) * 15;
	}

	if (ySum == mSum)
	{
		cout << "Y M " << ySum << endl;
	}
	else if (mSum < ySum)
	{
		cout << "M " << mSum << endl;
	}
	else
	{
		cout << "Y " << ySum << endl;
	}

	return 0;
}