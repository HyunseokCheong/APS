#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int arr[5];
	int sum = 0;
	int average;
	for (int i = 0; i < 5; i++)
	{
		cin >> arr[i];
		sum += arr[i];
	}

	sort(arr, arr + 5);
	average = sum / 5;
	cout << average << endl
		 << arr[2] << endl;
	return 0;
}