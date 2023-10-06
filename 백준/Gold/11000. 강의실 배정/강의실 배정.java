import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, answer;
    static Lecture[] lectures;
    static PriorityQueue<Integer> pq;
    
    static class Lecture {
        int start;
        int end;
        
        public Lecture(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        lectures = new Lecture[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            lectures[i] = new Lecture(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
    }
    
    static void process() throws IOException {
        Arrays.sort(lectures, (l1, l2) -> l1.start == l2.start ? l1.end - l2.end : l1.start - l2.start);
        pq = new PriorityQueue<>();
        pq.add(lectures[0].end);
        for (int i = 1; i < n; i++) {
            if (pq.peek() <= lectures[i].start) {
                pq.poll();
            }
            pq.offer(lectures[i].end);
        }
        answer = pq.size();
    }
    
    static void output() throws IOException {
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}