#include <iostream>
#include <string>

using namespace std;

int main()
{
	string input[] = {"SONGDO", "CODE", "2023", "ALGORITHM"};
	string output[] = {"HIGHSCHOOL", "MASTER", "0611", "CONTEST"};
	string str;
	cin >> str;
	for (int i = 0; i < 4; i++)
	{
		if (str == input[i])
		{
			cout << output[i] << endl;
			return 0;
		}
	}
}