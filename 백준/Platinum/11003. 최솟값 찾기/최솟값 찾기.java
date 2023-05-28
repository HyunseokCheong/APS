import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N, L;
    static int[] arr;
    
    static class dataPos {
        
        int data;
        int position;
        
        public dataPos(int data, int position) {
            this.data = data;
            this.position = position;
        }
    }
    
    static Deque<dataPos> deque;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (!deque.isEmpty() && i == deque.peekFirst().position + L) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && deque.peekLast().data > arr[i]) {
                deque.pollLast();
            }
            
            deque.addLast(new dataPos(arr[i], i));
            bw.write(deque.peekFirst().data + " ");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}