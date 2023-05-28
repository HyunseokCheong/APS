#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int pointerA      = 0;
    int pointerB      = 0;
    int pointerResult = 0;
    
    int N, M;
    cin >> N >> M;
    int      arrA[N + 1], arrB[M + 1];
    int      arrResult[N + M + 1];
    for (int i = 0; i < N; i++) {
        cin >> arrA[i];
    }
    for (int i = 0; i < M; i++) {
        cin >> arrB[i];
    }
    
    while (pointerA < N && pointerB < M) {
        if (arrA[pointerA] < arrB[pointerB]) {
            arrResult[pointerResult] = arrA[pointerA];
            
            pointerResult++;
            pointerA++;
        }
        if (arrA[pointerA] >= arrB[pointerB]) {
            arrResult[pointerResult] = arrB[pointerB];
            
            pointerResult++;
            pointerB++;
        }
    }
    
    while (pointerA < N) {
        for (int i = pointerA; i < N; i++) {
            arrResult[pointerResult] = arrA[pointerA];
            
            pointerResult++;
            pointerA++;
        }
    }
    
    while (pointerB < M) {
        for (int i = pointerB; i < M; i++) {
            arrResult[pointerResult] = arrB[pointerB];
            
            pointerResult++;
            pointerB++;
        }
    }
    
    for (int i = 0; i < N + M; i++) {
        cout << arrResult[i] << " ";
    }
    return 0;
}