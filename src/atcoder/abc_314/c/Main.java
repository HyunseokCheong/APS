package atcoder.abc_314.c;

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[] input = br.readLine().toCharArray();
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        List<Deque<Character>> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            list.add(new LinkedList<>());
        }
        
        for (int i = 0; i < N; i++) {
            int target = arr[i] - 1;
            list.get(target).add(input[i]);
        }
        
        for (int i = 0; i < M; i++) {
            list.get(i).addFirst(list.get(i).pollLast());
        }
        
        String answer = "";
        for (int i = 0; i < N; i++) {
            int target = arr[i] - 1;
            answer += list.get(target).poll();
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
