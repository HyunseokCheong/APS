/**
 * 스택
 * 최고점에서 좌우 탐색
 * 현재 높이가 이전의 높이보다 작으면 스택에 넣고
 * 아닌 경우, 스택 pop + 전 배열에 현재 값 넣기
 *
 * @Author HyunseokCheong
 * @Date 2023-01-16
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static int[] arr;
    static Stack<Integer> stack;
    static int S, E;
    static int L, H;
    static int temp;
    static int idx;
    static int area;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        arr = new int[1001];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            arr[L] = H;
            S = Math.min(L, S);
            E = Math.max(L, E);
        }
        
        // solve
        stack = new Stack<>();
        
        // left
        temp = arr[S];
        for (int i = S + 1; i <= E; i++) {
            if (arr[i] < temp) {
                stack.push(i);
            } else {
                while (!stack.isEmpty()) {
                    idx = stack.pop();
                    arr[idx] = temp;
                }
                temp = arr[i];
            }
        }
        stack.clear();
        
        // right
        temp = arr[E];
        for (int i = E - 1; i >= S; i--) {
            if (arr[i] < temp) {
                stack.push(i);
            } else {
                while (!stack.isEmpty()) {
                    idx = stack.pop();
                    arr[idx] = temp;
                }
                temp = arr[i];
            }
        }
        
        area = 0;
        for (int i = 0; i < arr.length; i++) {
            area += arr[i];
        }
        
        // write
        bw.write(area + "");
        bw.flush();
        bw.close();
    }
}