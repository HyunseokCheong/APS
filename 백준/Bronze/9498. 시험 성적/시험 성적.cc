#include <iostream>
using namespace std;

int main()
{
	int score;
	cin >> score;

	string grade = score >= 90 ? "A" : score >= 80 ? "B"
								   : score >= 70   ? "C"
								   : score >= 60   ? "D"
												   : "F";
	cout << grade << endl;
	return 0;
}