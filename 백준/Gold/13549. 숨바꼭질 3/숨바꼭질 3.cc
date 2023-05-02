#include <iostream>
#include <queue>
using namespace std;

int n, k;
int current;
int visited[100001]{};
int minValue = 1000000;

void solve()
{
	queue<int> queue;
	queue.push(n);
	visited[n] = 0;

	while (!queue.empty())
	{
		current = queue.front();
		queue.pop();

		if (current * 2 < 100001 && visited[current * 2] > visited[current])
		{
			queue.push(current * 2);
			visited[current * 2] = visited[current];
		}

		if (current + 1 < 100001 && visited[current + 1] > visited[current] + 1)
		{
			queue.push(current + 1);
			visited[current + 1] = visited[current] + 1;
		}

		if (current - 1 >= 0 && visited[current - 1] > visited[current] + 1)
		{
			queue.push(current - 1);
			visited[current - 1] = visited[current] + 1;
		}
	}
}

int main()
{
	cin >> n >> k;
	fill(visited, visited + 100001, 1000000);
	solve();
	cout << visited[k] << endl;
	return 0;
}