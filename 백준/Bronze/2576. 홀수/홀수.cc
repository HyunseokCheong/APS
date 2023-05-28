#include <iostream>
using namespace std;

int main()
{
	int inputNumber;
	int sumOfOddNumber = 0;
	int minValueOfOddNumber = 100;

	for (int i = 0; i < 7; i++)
	{
		cin >> inputNumber;
		if (inputNumber % 2 != 0)
		{
			sumOfOddNumber += inputNumber;
			minValueOfOddNumber = min(minValueOfOddNumber, inputNumber);
		}
	}

	if (sumOfOddNumber == 0)
	{
		cout << -1 << endl;
	}
	else
	{
		cout << sumOfOddNumber << endl
			 << minValueOfOddNumber << endl;
	}
	return 0;
}