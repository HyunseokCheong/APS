import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int input;
    static PriorityQueue<Point> pq;

    static class Point {
        int number, abs;

        public Point(int number) {
            this.number = number;
            this.abs = Math.abs(number);
        }
    }

    public static void main(String[] args) throws IOException {
        pq = new PriorityQueue<>((o1, o2) -> o1.abs == o2.abs ? o1.number - o2.number : o1.abs - o2.abs);
        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            input = Integer.parseInt(br.readLine());
            if (input == 0) {
                printQ();
                continue;
            }
            insertQ();
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static void printQ() throws IOException {
        if (pq.size() == 0) {
            bw.write(0 + "\n");
            return;
        }
        bw.write(pq.poll().number + "\n");
    }

    static void insertQ() {
        pq.add(new Point(input));
    }
}