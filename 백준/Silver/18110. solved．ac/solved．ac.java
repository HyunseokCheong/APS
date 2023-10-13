import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, exclude, sum;
    static int[] opinions;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        opinions = new int[n];
        for (int i = 0; i < n; i++) {
            opinions[i] = Integer.parseInt(br.readLine());
        }
    }
    
    static void process() throws IOException {
        Arrays.sort(opinions);
        exclude = getExclude(n);
        sum = 0;
        for (int i = exclude; i < n - exclude; i++) {
            sum += opinions[i];
        }
        bw.write(getAverage(sum, n - exclude * 2) + "\n");
    }
    
    static int getAverage(int num, int n) {
        return (int) Math.round((double) num / n);
    }
    
    static int getExclude(int n) {
        return (int) Math.round((double) n * 15 / 100);
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