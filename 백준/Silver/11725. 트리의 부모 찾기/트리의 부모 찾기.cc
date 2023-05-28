#include <iostream>
#include <vector>

using namespace std;
#define MAX 100001

int N;
int arr[MAX];
bool visited[MAX];
vector<int> V[MAX];

void dfs(int k) {
    visited[k] = true;
    for (int i = 0; i < V[k].size(); i++) {
        int next = V[k][i];
        if (!visited[next]) {
            arr[next] = k;
            dfs(next);
        }
    }
}

int main() {
    cin >> N;

    for (int i = 0; i < N - 1; i++) {
        int x, y;
        cin >> x >> y;
        V[x].push_back(y);
        V[y].push_back(x);
    }

    dfs(1);

    for (int i = 2; i <= N; i++) cout << arr[i] << "\n";
}