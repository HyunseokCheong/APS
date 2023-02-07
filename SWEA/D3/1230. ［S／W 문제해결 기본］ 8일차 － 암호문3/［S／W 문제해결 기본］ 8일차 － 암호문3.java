import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N;
    static int             Q;
    static List<Integer>   secretCode;
    static List<Integer>   query;
    static String          command;
    static int             X, Y;
    
    public static void main(String[] args) throws IOException {
        for (int t = 1; t < 11; t++) {
            bw.write("#" + t + " ");
            N          = Integer.parseInt(br.readLine());
            st         = new StringTokenizer(br.readLine());
            secretCode = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                secretCode.add(Integer.parseInt(st.nextToken()));
            }
            Q     = Integer.parseInt(br.readLine());
            st    = new StringTokenizer(br.readLine());
            query = new LinkedList<>();
            for (int i = 0; i < Q; i++) {
                command = st.nextToken();
                if (command.equals("I")) {
                    insert(secretCode, st);
                } else if (command.equals("D")) {
                    delete(secretCode, st);
                } else {
                    add(secretCode, st);
                }
            }
            for (int i = 0; i < 10; i++) {
                bw.write(secretCode.get(i) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    
    public static void insert(List<Integer> secretCode, StringTokenizer st) {
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        for (int i = 0; i < Y; i++) {
            secretCode.add(X + i, Integer.parseInt(st.nextToken()));
        }
    }
    
    public static void delete(List<Integer> secretCode, StringTokenizer st) {
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        for (int i = 0; i < Y; i++) {
            secretCode.remove(X);
        }
    }
    
    public static void add(List<Integer> secretCode, StringTokenizer st) {
        Y = Integer.parseInt(st.nextToken());
        for (int i = 0; i < Y; i++) {
            secretCode.add(Integer.parseInt(st.nextToken()));
        }
    }
}