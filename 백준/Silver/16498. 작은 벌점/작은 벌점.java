import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    
    static int A, B, C;
    static int[] aList, bList, cList;
    static int point, minPoint;
    static int aPoint, bPoint, cPoint;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        A  = Integer.parseInt(st.nextToken());
        B  = Integer.parseInt(st.nextToken());
        C  = Integer.parseInt(st.nextToken());
        
        st    = new StringTokenizer(br.readLine());
        aList = new int[A];
        for (int i = 0; i < A; i++) {
            aList[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(aList);
        
        st    = new StringTokenizer(br.readLine());
        bList = new int[B];
        for (int i = 0; i < B; i++) {
            bList[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(bList);
        
        st    = new StringTokenizer(br.readLine());
        cList = new int[C];
        for (int i = 0; i < C; i++) {
            cList[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cList);
    }
    
    static void process() throws IOException {
        minPoint = Integer.MAX_VALUE;
        
        for (int a = 0; a < A; a++) {
            for (int b = 0; b < B; b++) {
                for (int c = 0; c < C; c++) {
                    aPoint   = aList[a];
                    bPoint   = bList[b];
                    cPoint   = cList[c];
                    point    = getDemerit(aPoint, bPoint, cPoint);
                    minPoint = Math.min(minPoint, point);
                }
            }
        }
        
        System.out.println(minPoint);
    }
    
    static int getDemerit(int a, int b, int c) {
        return Math.abs(Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c)));
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}