import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static       BufferedReader  br       = new BufferedReader(new InputStreamReader(System.in));
    static       BufferedWriter  bw       = new BufferedWriter(new OutputStreamWriter(System.out));
    static       StringTokenizer st;
    static       String          endl     = "\n";
    static       String          blank    = " ";
    static final int             MAX_SIZE = 1000001;
    static       int             originNumber;
    static       int             targetNumber;
    static       int             nowPosition;
    static       int             nextPosition;
    static       int[]           countToArrive;
    static       Queue<Integer>  queue;
    
    static void input() throws IOException {
        stk();
        originNumber = Integer.parseInt(st.nextToken());
        targetNumber = Integer.parseInt(st.nextToken());
    }
    
    static void process() {
        countToArrive = new int[MAX_SIZE];
        Arrays.fill(countToArrive, Integer.MAX_VALUE);
        queue = new LinkedList<>();
        
        queue.add(originNumber);
        countToArrive[originNumber] = 0;
        
        while (!queue.isEmpty()) {
            nowPosition = queue.poll();
            
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    nextPosition = nowPosition + 1;
                } else {
                    nextPosition = nowPosition * 2;
                }
                
                if (nextPosition >= MAX_SIZE) {
                    continue;
                }
                
                if (countToArrive[nextPosition] > countToArrive[nowPosition] + 1) {
                    countToArrive[nextPosition] = countToArrive[nowPosition] + 1;
                    queue.add(nextPosition);
                }
            }
        }
    }
    
    static void output() throws IOException {
        bw.write(countToArrive[targetNumber] + blank);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}