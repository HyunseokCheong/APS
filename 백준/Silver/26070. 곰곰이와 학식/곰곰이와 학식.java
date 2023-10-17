import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b, c;
    static int d, e, f;
    static int food;
    static long count;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        count = 0;
        for (int i = 0; i < 3; i++) {
            process();
        }
    }
    
    static void process() throws IOException {
        food = Math.min(a, d);
        count += food;
        a -= food;
        d -= food;
        
        food = Math.min(b, e);
        count += food;
        b -= food;
        e -= food;
        
        food = Math.min(c, f);
        count += food;
        c -= food;
        f -= food;
        
        int temp1 = d;
        int temp2 = e;
        int temp3 = f;
        e = temp1 / 3;
        f = temp2 / 3;
        d = temp3 / 3;
    }
    
    static void output() throws IOException {
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        output();
    }
}