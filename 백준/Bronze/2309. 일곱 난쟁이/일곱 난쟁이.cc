#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int dwarf[9];
	int sum = -100;

	for (int i = 0; i < 9; i++)
	{
		cin >> dwarf[i];
		sum += dwarf[i];
	}

	sort(dwarf, dwarf + 9);
	int fakeDwarf1 = 0;
	int fakeDwarf2 = 0;
	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			if (i == j)
			{
				continue;
			}

			if (dwarf[i] + dwarf[j] == sum)
			{
				fakeDwarf1 = i;
				fakeDwarf2 = j;
				break;
			}
		}
	}

	for (int i = 0; i < 9; i++)
	{
		if (i == fakeDwarf1 or i == fakeDwarf2)
		{
			continue;
		}

		cout << dwarf[i] << endl;
	}

	return 0;
}