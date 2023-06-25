#include <iostream>
#include <string>

using namespace std;

int main()
{
	string input;
	string output;
	cin >> input;

	if (input == "SONGDO")
	{
		output = "HIGHSCHOOL";
	}
	else if (input == "CODE")
	{
		output = "MASTER";
	}
	else if (input == "2023")
	{
		output = "0611";
	}
	else if (input == "ALGORITHM")
	{
		output = "CONTEST";
	}
	cout << output << endl;
}