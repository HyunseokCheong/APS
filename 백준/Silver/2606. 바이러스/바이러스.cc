#include <bits/stdc++.h>

using namespace std;

int n, m, s, e;
int matrix[101][101];
bool visited[101];
int answer;
queue<int> q;

void bfs(int x) {
    q.push(x);
    visited[x] = true;

    while (!q.empty()) {
        x = q.front();
        q.pop();
        for (int i = 1; i <= n; i++) {
            if (matrix[x][i] == 1 && !visited[i]) {
                q.push(i);
                visited[i] = true;
                answer++;
            }
        }
    }
}

int main() {
    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        cin >> s >> e;
        matrix[s][e] = 1;
        matrix[e][s] = 1;
    }
    bfs(1);
    cout << answer << endl;
}