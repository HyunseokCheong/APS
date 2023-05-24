#include <iostream>
#include <queue>
#define MAX 100001
#define endl "\n"
using namespace std;

int visited[MAX];
int main()
{
	int a, b;
	queue<int> queue;

	cin >> a >> b;
	visited[a] = 1;
	queue.push(a);

	while (!queue.empty())
	{
		int current = queue.front();
		queue.pop();

		if (current == b)
		{
			cout << visited[current] - 1 << endl;
		}

		if (current - 1 != -1 and visited[current - 1] == 0)
		{
			visited[current - 1] = visited[current] + 1;
			queue.push(current - 1);
		}
		if (current + 1 != MAX and visited[current + 1] == 0)
		{
			visited[current + 1] = visited[current] + 1;
			queue.push(current + 1);
		}
		if (current * 2 < MAX and visited[current * 2] == 0)
		{
			visited[current * 2] = visited[current] + 1;
			queue.push(current * 2);
		}
	}

	return 0;
}