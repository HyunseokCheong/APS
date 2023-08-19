import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                queue.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            
            int count = 0;
            while (!queue.isEmpty()) {
                int[] first = queue.poll();
                boolean flag = true;
                
                for (int i = 0; i < queue.size(); i++) {
                    if(first[1] < queue.get(i)[1]) {
                        queue.offer(first);
                        for (int j = 0; j < i ; j++) {
                            queue.offer(queue.poll());
                        }
                        
                        flag=false;
                        break;
                    }
                }
                if (!flag) {
                    continue;
                }
                count++;
                if (first[0] == m) {
                    break;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}