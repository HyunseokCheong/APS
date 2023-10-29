import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        int colA = a / 4;
        int rowA;
        if (a % 4 == 0) {
            colA--;
            rowA = 3;
        } else {
            rowA = a % 4 - 1;
        }
        int colB = b / 4;
        int rowB;
        if (b % 4 == 0) {
            colB--;
            rowB = 3;
        } else {
            rowB = b % 4 - 1;
        }
        int result = Math.abs(rowA - rowB) + Math.abs(colA - colB);
        bw.write(result + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}