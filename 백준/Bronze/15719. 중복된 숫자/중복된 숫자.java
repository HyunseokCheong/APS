import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int n;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n];


        // solve
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (visited[num - 1]) {
                answer = num;
            } else {
                visited[num - 1] = true;
            }
        }

        bw.write(answer + "\n");

        // print
        bw.flush();
        bw.close();
    }
}