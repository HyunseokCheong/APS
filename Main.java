import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             point;
    static int[]           arr;
    
    static void input() throws IOException {
        stk();
        arr   = new int[3];
        point = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            point += arr[i];
        }
    }
    
    static char findUnique(int target) {
        int findIndex = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == target) {
                findIndex = i;
                break;
            }
        }
        switch (findIndex) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
        }
        return ' ';
    }
    
    static char getAnswer(int point) {
        if (point == 0 || point == 3) {
            return '*';
        }
        if (point == 1) {
            return findUnique(1);
        }
        return findUnique(0);
    }
    
    static void process() throws IOException {
        bw.write(getAnswer(point) + endl);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}
