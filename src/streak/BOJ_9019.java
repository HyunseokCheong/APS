package streak;

import java.io.*;
import java.util.*;

public class BOJ_9019 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int T, A, B;
    static Queue<Integer> queue;
    static String[] command;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            command = new String[10000];
            Arrays.fill(command, "");
            visited = new boolean[10000];
            queue = new LinkedList<>();
            
            visited[A] = true;
            queue.add(A);
            while (!queue.isEmpty() && !visited[B]) {
                int number = queue.poll();
                int D = (2 * number) % 10000;
                int S = number == 0 ? 9999 : number - 1;
                int L = number % 1000 * 10 + number / 1000;
                int R = number % 10 * 1000 + number / 10;
                
                if (!visited[D]) {
                    queue.add(D);
                    visited[D] = true;
                    command[D] = command[number] + "D";
                }
                
                if (!visited[S]) {
                    queue.add(S);
                    visited[S] = true;
                    command[S] = command[number] + "S";
                }
                if (!visited[L]) {
                    queue.add(L);
                    visited[L] = true;
                    command[L] = command[number] + "L";
                }
                if (!visited[R]) {
                    queue.add(R);
                    visited[R] = true;
                    command[R] = command[number] + "R";
                }
            }
            bw.write(command[B] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
