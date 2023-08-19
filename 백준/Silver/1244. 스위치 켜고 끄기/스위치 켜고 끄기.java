import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int[] arr;
    static int M;
    static int sex;
    static int num;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            sex = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());
            process();
        }
    }
    
    static void process() throws IOException {
        if (sex == 1) {
            for (int i = num - 1; i < N; i += num) {
                arr[i] = check(arr[i]);
            }
            return;
        }
        
        arr[num - 1] = check(arr[num - 1]);
        
        int left = num - 2;
        int right = num;
        while (true) {
            if (left < 0 || right > N - 1) {
                break;
            }
            if (arr[left] != arr[right]) {
                break;
            }
            arr[left] = check(arr[left]);
            arr[right] = check(arr[right]);
            left--;
            right++;
        }
    }
    
    static int check(int X) {
        if (X == 0) {
            return 1;
        }
        return 0;
    }
    
    static void output() throws IOException {
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + " ");
            if ((i + 1) % 20 == 0) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        output();
    }
}